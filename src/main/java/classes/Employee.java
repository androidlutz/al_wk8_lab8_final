package main.java.classes;

import java.util.Date;


public class Employee extends Person{

    //attributes
    private String jobTitle;
    private Date hireDate;

    //Member Functions
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jT) {
        jobTitle = jT;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hD) {
        hireDate = hD;
    }

    public Employee(int id, String firstName, String lastName, String jobTitle, Date hireDate) {

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setHireDate(hireDate);
        setJobTitle(jobTitle);
       
        


    }

    
    
  
    
}