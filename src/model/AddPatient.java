
package model;

import java.sql.Statement;


public class AddPatient {
    
    Statement stmt;
 public void Patient(String Pname, String Pnum, String Dname,String category, String payment){
 try{
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate("INSERT INTO addpatient VALUES('"+Pname+"','"+Pnum+"', '"+Dname+"', '"+category+"', '"+payment+"')");
 } catch(Exception e){
 e.printStackTrace();
 }
 }  
}
