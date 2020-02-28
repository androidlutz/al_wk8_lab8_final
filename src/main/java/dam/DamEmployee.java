package main.java.dam;

import main.java.classes.Employee;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
//create Dam Employee
public class DamEmployee extends SqlInterface{

    //String Builder Statement
    public ArrayList<Employee> getEmployees(String id){
        
        ArrayList<Employee> employees = new ArrayList<Employee>();

            StringBuilder sb = new StringBuilder();
           sb.append("SELECT");
           sb.append(" P.BusinessEntityID,P.FirstName,P.LastName");
           sb.append(" ,E.HireDate,E.JobTitle");
           sb.append(" FROM");
           sb.append(" HumanResources.Employee AS E");
           sb.append(" JOIN Person.Person AS P");
           sb.append(" ON P.BusinessEntityID = E.BusinessEntityID");
           if(id != null){
               sb.append(" WHERE");
               sb.append(" E.BusinessEntityID=" + id);

           }             
        //attempt data retrieval
           try(Connection con = getConnection(); Statement stmt = getStatement()){
                ResultSet rs = stmt.executeQuery(sb.toString());

                while(rs.next()){
                    Employee e = new Employee(
                        rs.getInt("BusinessEntityID"),
                        rs.getString("FirstName"),
                        rs.getString("LastName"),                        
                        rs.getString("JobTitle"),
                        getResultSetDate(rs, "HireDate")
                     );

                     employees.add(e);

                }

                return employees;

           }
           catch(SQLException e){
             e.printStackTrace();
             return null;
           }         


    }

    

} 