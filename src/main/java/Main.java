//Header
//Andrew Lutz
//Program Name Employee
//02/27/2020
//Winter 2020 CS 162 
//A program to bring an employee from a database

package main.java;

//imports
import main.java.dam.Database;
import java.util.HashMap;
import java.util.Date;
import main.java.classes.Employee;
import main.java.dam.DamEmployee;
import java.util.ArrayList;


class Main{
    public static void main(String[] args){
        //Store the connection parameters
        HashMap<String,String> params = new HashMap<String,String>();
        params.put("host", "192.154.227.17");
        params.put("instance", "CGCC");
        params.put("port", "1444");
        params.put("dbName", "AdventureWorks");
        params.put("integrated", "false");
        params.put("dbUser", "jdoe");
        params.put("dbPassword", "Password1234!");

        //init the database conenction
        Database.initDatabase(params);
    
        System.out.println(Database.getConnectionURL());

       ArrayList<Employee> employees = new DamEmployee().getEmployees(null);

        for(Employee e : employees){
            System.out.println(e.getFirstName() + " " + e.getLastName() + " " + e.getHireDate().toString());

        }
       
    }
}

/*Footer
Ken Sánchez Wed Jan 14 00:00:00 PST 2009
Terri Duffy Thu Jan 31 00:00:00 PST 2008
Roberto Tamburello Sun Nov 11 00:00:00 PST 2007
Rob Walters Wed Dec 05 00:00:00 PST 2007
Gail Erickson Sun Jan 06 00:00:00 PST 2008
Jossef Goldberg Thu Jan 24 00:00:00 PST 2008
Dylan Miller Sun Feb 08 00:00:00 PST 2009
Diane Margheim Mon Dec 29 00:00:00 PST 2008
Gigi Matthew Fri Jan 16 00:00:00 PST 2009
Michael Raheem Sun May 03 00:00:00 PDT 2009
Ovidiu Cracium Sun Dec 05 00:00:00 PST 2010
Thierry D'Hers Tue Dec 11 00:00:00 PST 2007
Janice Galvin Thu Dec 23 00:00:00 PST 2010
Michael Sullivan Thu Dec 30 00:00:00 PST 2010
Sharon Salavaria Tue Jan 18 00:00:00 PST 2011
David Bradley Thu Dec 20 00:00:00 PST 2007
Kevin Brown Fri Jan 26 00:00:00 PST 2007
John Wood Mon Feb 07 00:00:00 PST 2011
Mary Dempsey Mon Feb 14 00:00:00 PST 2011
Wanida Benshoof Fri Jan 07 00:00:00 PST 2011
Terry Eminhizer Mon Mar 02 00:00:00 PST 2009
Sariya Harnpadoungsataya Fri Dec 12 00:00:00 PST 2008
Mary Gibson Mon Jan 12 00:00:00 PST 2009
Jill Williams Sun Jan 18 00:00:00 PST 2009
James Hamilton Tue Feb 03 00:00:00 PST 2009
Peter Krebs Mon Dec 01 00:00:00 PST 2008
Jo Brown Wed Feb 27 00:00:00 PST 2008
Guy Gilbert Fri Jun 30 00:00:00 PDT 2006
Mark McArthur Fri Jan 23 00:00:00 PST 2009
Britta Simon Thu Jan 29 00:00:00 PST 2009
Margie Shoop Sun Jan 04 00:00:00 PST 2009
Rebecca Laszlo Mon Dec 29 00:00:00 PST 2008
Annik Stahl Wed Dec 17 00:00:00 PST 2008
Suchitra Mohan Mon Feb 16 00:00:00 PST 2009
Brandon Heidepriem Sun Feb 08 00:00:00 PST 2009
Jose Lugo Tue Feb 10 00:00:00 PST 2009
Chris Okelberry Sat Mar 07 00:00:00 PST 2009
Kim Abercrombie Sat Jan 16 00:00:00 PST 2010
Ed Dudenhoefer Fri Feb 05 00:00:00 PST 2010
JoLynn Dobney Wed Dec 26 00:00:00 PST 2007
Bryan Baker Wed Jan 21 00:00:00 PST 2009
James Kramer Sat Dec 27 00:00:00 PST 2008
Nancy Anderson Fri Jan 02 00:00:00 PST 2009
Simon Rapier Mon Dec 08 00:00:00 PST 2008
Thomas Michaels Thu Feb 26 00:00:00 PST 2009
Eugene Kogan Sun Feb 08 00:00:00 PST 2009
Andrew Hill Sun Feb 22 00:00:00 PST 2009
Ruth Ellerbrock Sun Jan 06 00:00:00 PST 2008
Barry Johnson Mon Jan 07 00:00:00 PST 2008
Sidney Higa Sat Feb 02 00:00:00 PST 2008
Jeffrey Ford Wed Feb 20 00:00:00 PST 2008
Doris Hartwig Mon Mar 10 00:00:00 PDT 2008
Diane Glimp Fri Mar 28 00:00:00 PDT 2008
Bonnie Kearney Fri Jan 01 00:00:00 PST 2010
Taylor Maxwell Fri Feb 08 00:00:00 PST 2008
Denise Smith Thu Feb 05 00:00:00 PST 2009
Frank Miller Mon Feb 23 00:00:00 PST 2009
Kendall Keil Fri Dec 05 00:00:00 PST 2008
Bob Hohman Wed Dec 24 00:00:00 PST 2008
Pete Male Sun Jan 11 00:00:00 PST 2009
Diane Tibbott Sun Jan 18 00:00:00 PST 2009
John Campbell Mon Mar 17 00:00:00 PDT 2008
Maciej Dusza Fri Jan 29 00:00:00 PST 2010
Michael Zwilling Tue Feb 23 00:00:00 PST 2010
Randy Reeves Tue Feb 23 00:00:00 PST 2010
Karan Khanna Tue Dec 22 00:00:00 PST 2009
Jay Adams Thu Mar 05 00:00:00 PST 2009
Charles Fitzgerald Thu Dec 03 00:00:00 PST 2009
Steve Masters Sun Feb 15 00:00:00 PST 2009
David Ortiz Mon Dec 15 00:00:00 PST 2008
Michael Ray Sun Feb 15 00:00:00 PST 2009
Steven Selikoff Mon Dec 01 00:00:00 PST 2008
Carole Poland Fri Dec 19 00:00:00 PST 2008
Bjorn Rettig Wed Jan 07 00:00:00 PST 2009
Michiko Osada Mon Jan 26 00:00:00 PST 2009
Carol Philips Thu Feb 12 00:00:00 PST 2009
Merav Netz Tue Mar 03 00:00:00 PST 2009
Reuben D'sa Mon Dec 15 00:00:00 PST 2008
Eric Brown Sun Jan 24 00:00:00 PST 2010
Sandeep Kaliyath Sun Jan 17 00:00:00 PST 2010
Mihail Frintu Tue Dec 29 00:00:00 PST 2009
Jack Creasey Wed Mar 03 00:00:00 PST 2010
Patrick Cook Fri Feb 12 00:00:00 PST 2010
Frank Martinez Fri Feb 05 00:00:00 PST 2010
Brian Goldstein Fri Dec 11 00:00:00 PST 2009
Ryan Cornelsen Mon Jan 05 00:00:00 PST 2009
Cristian Petculescu Mon Dec 22 00:00:00 PST 2008
Betsy Stadick Fri Dec 18 00:00:00 PST 2009
Patrick Wedge Mon Feb 01 00:00:00 PST 2010
Danielle Tiedt Sat Feb 20 00:00:00 PST 2010
Kimberly Zimmerman Tue Jan 12 00:00:00 PST 2010
Tom Vande Velde Wed Mar 10 00:00:00 PST 2010
Kok-Ho Loh Sat Dec 27 00:00:00 PST 2008
Russell Hunter Fri Dec 12 00:00:00 PST 2008
Jim Scardelis Fri Dec 19 00:00:00 PST 2008
Elizabeth Keyser Mon Mar 02 00:00:00 PST 2009
Mandar Samant Tue Feb 10 00:00:00 PST 2009
Sameer Tejani Wed Feb 11 00:00:00 PST 2009
Nuan Yu Tue Jan 06 00:00:00 PST 2009
Lolan Song Mon Jan 12 00:00:00 PST 2009
Houman Pournasseh Sun Jan 25 00:00:00 PST 2009
Zheng Mu Wed Dec 03 00:00:00 PST 2008
Ebru Ersan Sun Dec 06 00:00:00 PST 2009
Mary Baker Fri Dec 25 00:00:00 PST 2009
Kevin Homer Fri Dec 25 00:00:00 PST 2009
John Kane Sat Feb 27 00:00:00 PST 2010
Christopher Hill Mon Feb 08 00:00:00 PST 2010
Jinghao Liu Mon Dec 08 00:00:00 PST 2008
Alice Ciccu Sun Dec 07 00:00:00 PST 2008
Jun Cao Sun Dec 14 00:00:00 PST 2008
Suroor Fatima Wed Dec 17 00:00:00 PST 2008
John Evans Thu Jan 01 00:00:00 PST 2009
Linda Moschell Thu Dec 25 00:00:00 PST 2008
Mindaugas Krapauskas Tue Jan 13 00:00:00 PST 2009
Angela Barbariol Tue Jan 20 00:00:00 PST 2009
Michael Patten Sat Jan 31 00:00:00 PST 2009
Chad Niswonger Wed Feb 18 00:00:00 PST 2009
Don Hall Fri Feb 13 00:00:00 PST 2009
Michael Entin Wed Feb 25 00:00:00 PST 2009
Kitti Lertpiriyasuwat Wed Mar 04 00:00:00 PST 2009
Pilar Ackerman Fri Jan 02 00:00:00 PST 2009
Susan Eaton Sun Dec 07 00:00:00 PST 2008
Vamsi Kuppa Sun Dec 07 00:00:00 PST 2008
Kim Ralls Fri Dec 26 00:00:00 PST 2008
Matthias Berndt Tue Jan 20 00:00:00 PST 2009
Jimmy Bischoff Thu Feb 26 00:00:00 PST 2009
David Hamilton Sat Jan 03 00:00:00 PST 2009
Paul Komosinski Thu Dec 04 00:00:00 PST 2008
Gary Yukish Mon Dec 22 00:00:00 PST 2008
Rob Caron Fri Feb 13 00:00:00 PST 2009
Baris Cetinok Sun Feb 15 00:00:00 PST 2009
Nicole Holliday Sun Feb 22 00:00:00 PST 2009
Michael Rothkugel Sat Jan 10 00:00:00 PST 2009
Eric Gubbels Wed Jan 14 00:00:00 PST 2009
Ivo Salmre Thu Dec 04 00:00:00 PST 2008
Sylvester Valdez Fri Dec 11 00:00:00 PST 2009
Anibal Sousa Mon Feb 23 00:00:00 PST 2009
Samantha Smith Wed Feb 04 00:00:00 PST 2009
Hung-Fu Ting Wed Jan 06 00:00:00 PST 2010
Prasanna Samarawickrama Fri Jan 22 00:00:00 PST 2010
Min Su Sun Jan 24 00:00:00 PST 2010
Olinda Turner Thu Mar 04 00:00:00 PST 2010
Krishna Sunkammurali Sat Feb 13 00:00:00 PST 2010
Paul Singh Sat Jan 17 00:00:00 PST 2009
Cynthia Randall Tue Jan 27 00:00:00 PST 2009
Jian Shuo Wang Sun Dec 07 00:00:00 PST 2008
Sandra Reátegui Alayo Fri Dec 26 00:00:00 PST 2008
Jason Watters Wed Jan 14 00:00:00 PST 2009
Andy Ruth Sat Jan 31 00:00:00 PST 2009
Michael Vanderhyde Thu Feb 26 00:00:00 PST 2009
Rostislav Shabalin Thu Feb 19 00:00:00 PST 2009
Yuhong Li Sun Feb 01 00:00:00 PST 2009
Hanying Feng Tue Dec 16 00:00:00 PST 2008
Raymond Sam Tue Dec 23 00:00:00 PST 2008
Fadi Fakhouri Sun Jan 04 00:00:00 PST 2009
Lane Sacksteder Sun Jan 11 00:00:00 PST 2009
Linda Randall Tue Feb 03 00:00:00 PST 2009
Shelley Dyck Sat Mar 07 00:00:00 PST 2009
Terrence Earls Mon Feb 16 00:00:00 PST 2009
Jeff Hay Wed Jan 21 00:00:00 PST 2009
Kirk Koenigsbauer Mon Dec 15 00:00:00 PST 2008
Laura Steele Sat Jan 03 00:00:00 PST 2009
Alex Nayberg Sun Feb 08 00:00:00 PST 2009
Andrew Cencini Fri Mar 06 00:00:00 PST 2009
Chris Preston Thu Jan 22 00:00:00 PST 2009
Jack Richins Sat Feb 21 00:00:00 PST 2009
David Johnson Tue Dec 02 00:00:00 PST 2008
Garrett Young Sun Dec 07 00:00:00 PST 2008
Susan Metters Sun Dec 14 00:00:00 PST 2008
George Li Sun Dec 21 00:00:00 PST 2008
David Yalovsky Fri Jan 02 00:00:00 PST 2009
Marc Ingle Fri Jan 16 00:00:00 PST 2009
Eugene Zabokritski Wed Jan 21 00:00:00 PST 2009
Benjamin Martin Tue Jan 27 00:00:00 PST 2009
Reed Koch Mon Feb 02 00:00:00 PST 2009
David Lawrence Sat Feb 14 00:00:00 PST 2009
Russell King Sat Feb 21 00:00:00 PST 2009
John Frum Tue Mar 03 00:00:00 PST 2009
Jan Miksovsky Thu Mar 05 00:00:00 PST 2009
Katie McAskill-White Fri Feb 20 00:00:00 PST 2009
Michael Hines Tue Dec 09 00:00:00 PST 2008
Nitin Mirchandani Sun Dec 28 00:00:00 PST 2008
Barbara Decker Thu Jan 22 00:00:00 PST 2009
John Chen Mon Feb 09 00:00:00 PST 2009
Stefen Hesse Sat Feb 28 00:00:00 PST 2009
Shane Kim Sun Feb 08 00:00:00 PST 2009
Yvonne McKay Tue Dec 09 00:00:00 PST 2008
Douglas Hite Sat Dec 27 00:00:00 PST 2008
Janeth Esteves Thu Jan 15 00:00:00 PST 2009
Robert Rounthwaite Mon Feb 02 00:00:00 PST 2009
Lionel Penuchot Thu Feb 26 00:00:00 PST 2009
Brenda Diaz Thu Mar 05 00:00:00 PST 2009
Alejandro McGuel Sat Dec 06 00:00:00 PST 2008
Fred Northup Fri Dec 12 00:00:00 PST 2008
Kevin Liu Wed Dec 17 00:00:00 PST 2008
Shammi Mohamed Wed Dec 24 00:00:00 PST 2008
Rajesh Patel Wed Dec 31 00:00:00 PST 2008
Lorraine Nay Sun Jan 04 00:00:00 PST 2009
Paula Nartker Mon Jan 12 00:00:00 PST 2009
Frank Lee Sat Jan 17 00:00:00 PST 2009
Brian Lloyd Thu Jan 29 00:00:00 PST 2009
Tawana Nusbaum Thu Feb 05 00:00:00 PST 2009
Ken Myer Tue Feb 24 00:00:00 PST 2009
Gabe Mares Sun Mar 08 00:00:00 PST 2009
Lori Kane Thu Feb 26 00:00:00 PST 2009
Stuart Munson Tue Dec 02 00:00:00 PST 2008
Greg Alderson Tue Dec 02 00:00:00 PST 2008
Scott Gode Thu Jan 08 00:00:00 PST 2009
Kathie Flood Tue Jan 27 00:00:00 PST 2009
Belinda Newman Fri Feb 20 00:00:00 PST 2009
Hazem Abolrous Sat Feb 28 00:00:00 PST 2009
Peng Wu Tue Dec 09 00:00:00 PST 2008
Sootha Charncherngkha Tue Feb 23 00:00:00 PST 2010
Andreas Berglund Mon Feb 02 00:00:00 PST 2009
Mark Harrington Thu Jan 15 00:00:00 PST 2009
Sean Alexander Sun Dec 28 00:00:00 PST 2008
Zainal Arifin Sun Jan 04 00:00:00 PST 2009
Tengiz Kharatishvili Tue Dec 16 00:00:00 PST 2008
Sean Chai Thu Jan 22 00:00:00 PST 2009
Karen Berge Mon Feb 09 00:00:00 PST 2009
Chris Norred Fri Mar 06 00:00:00 PST 2009
A. Scott Wright Fri Dec 12 00:00:00 PST 2008
Sairaj Uddin Mon Jan 26 00:00:00 PST 2009
William Vong Wed Jan 07 00:00:00 PST 2009
Alan Brewer Fri Feb 13 00:00:00 PST 2009
Brian LaMee Tue Mar 03 00:00:00 PST 2009
Gary Altman Wed Dec 02 00:00:00 PST 2009
Christian Kleinerman Sun Dec 14 00:00:00 PST 2008
Lori Penor Tue Feb 16 00:00:00 PST 2010
Stuart Macrae Fri Mar 05 00:00:00 PST 2010
Jo Berry Sun Mar 07 00:00:00 PST 2010
Pat Coleman Wed Jan 27 00:00:00 PST 2010
Magnus Hedlund Mon Dec 21 00:00:00 PST 2009
Laura Norman Sat Jan 31 00:00:00 PST 2009
Paula Barreto de Mattos Sat Dec 06 00:00:00 PST 2008
Grant Culbertson Wed Feb 25 00:00:00 PST 2009
Hao Chen Fri Feb 06 00:00:00 PST 2009
Vidur Luthra Thu Jan 01 00:00:00 PST 2009
Mindy Martin Thu Dec 25 00:00:00 PST 2008
Willis Johnson Sat Dec 13 00:00:00 PST 2008
David Liu Fri Jan 30 00:00:00 PST 2009
Deborah Poe Thu Dec 18 00:00:00 PST 2008
Candy Spoon Tue Jan 06 00:00:00 PST 2009
Bryan Walton Sat Jan 24 00:00:00 PST 2009
Barbara Moreland Wed Feb 18 00:00:00 PST 2009
Dragan Tomic Wed Feb 11 00:00:00 PST 2009
Janet Sheperdigian Sun Mar 01 00:00:00 PST 2009
Mike Seamans Sun Mar 08 00:00:00 PST 2009
Wendy Kahn Thu Dec 25 00:00:00 PST 2008
Sheela Word Fri Feb 25 00:00:00 PST 2011
Mikael Sandberg Tue Feb 10 00:00:00 PST 2009
Arvind Rao Sat Feb 28 00:00:00 PST 2009
Linda Meisner Thu Dec 17 00:00:00 PST 2009
Fukiko Ogisu Mon Jan 04 00:00:00 PST 2010
Gordon Hee Mon Jan 11 00:00:00 PST 2010
Frank Pellow Sat Jan 23 00:00:00 PST 2010
Eric Kurjan Wed Jan 27 00:00:00 PST 2010
Erin Hagens Sun Jan 31 00:00:00 PST 2010
Ben Miller Tue Mar 09 00:00:00 PST 2010
Annette Hill Mon Dec 06 00:00:00 PST 2010
Reinout Hillmann Sat Dec 25 00:00:00 PST 2010
David Barber Mon Jan 12 00:00:00 PST 2009
Jean Trenary Thu Dec 11 00:00:00 PST 2008
Stephanie Conroy Wed Feb 04 00:00:00 PST 2009
Ashvini Sharma Thu Dec 04 00:00:00 PST 2008
Peter Connelly Mon Feb 23 00:00:00 PST 2009
Karen Berg Mon Feb 16 00:00:00 PST 2009
Ramesh Meyyappan Tue Feb 03 00:00:00 PST 2009
Dan Bacon Sun Jan 11 00:00:00 PST 2009
François Ajenstat Sat Jan 17 00:00:00 PST 2009
Dan Wilson Thu Jan 22 00:00:00 PST 2009
Janaina Bueno Tue Dec 23 00:00:00 PST 2008
Brian Welcker Tue Feb 15 00:00:00 PST 2011
Stephen Jiang Tue Jan 04 00:00:00 PST 2011
Michael Blythe Tue May 31 00:00:00 PDT 2011
Linda Mitchell Tue May 31 00:00:00 PDT 2011
Jillian Carson Tue May 31 00:00:00 PDT 2011
Garrett Vargas Tue May 31 00:00:00 PDT 2011
Tsvi Reiter Tue May 31 00:00:00 PDT 2011
Pamela Ansman-Wolfe Tue May 31 00:00:00 PDT 2011
Shu Ito Tue May 31 00:00:00 PDT 2011
José Saraiva Tue May 31 00:00:00 PDT 2011
David Campbell Tue May 31 00:00:00 PDT 2011
Tete Mensa-Annan Sun Sep 30 00:00:00 PDT 2012
Syed Abbas Thu Mar 14 00:00:00 PDT 2013
Lynn Tsoflias Thu May 30 00:00:00 PDT 2013
Amy Alberts Mon Apr 16 00:00:00 PDT 2012
Rachel Valdez Thu May 30 00:00:00 PDT 2013
Jae Pak Wed May 30 00:00:00 PDT 2012
Ranjit Varkey Chudukatil Wed May 30 00:00:00 PDT 2012
*/