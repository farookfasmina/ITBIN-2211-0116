/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class DBSearch {
            Statement stmt;
           ResultSet rs;
      public ResultSet searchLogin(String usName) {
       try {
           stmt = DBConnection.getStatementConnection();
           String name = usName;
//Execute the Query
         rs = stmt.executeQuery("SELECT * FROM login where username='"+ name + "'");
       } catch (Exception e) {
      e.printStackTrace();
       }
       return rs;
  }
      
      public ResultSet searchLoginadmin(String usName) {
       try {
           stmt = DBConnection.getStatementConnection();
           String name = usName;
//Execute the Query
         rs = stmt.executeQuery("SELECT * FROM admin where Admin_Id='"+ name + "'");
       } catch (Exception e) {
      e.printStackTrace();
       }
       return rs;
  }
      
      
  
       public ResultSet searchStudents(){
        try{
        stmt = DBConnection.getStatementConnection();
        rs = stmt.executeQuery("SELECT * FROM patient");
 }
        catch(Exception e){

       }
        return rs;
  }
       
       public ResultSet searchpatient() {
        ResultSet rs = null;
        Statement stmt = null;

        try {
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM appointment");
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return rs;
    }
       
       public ResultSet searchBooks() {
                try {
          stmt = DBConnection.getStatementConnection();
          rs = stmt.executeQuery("SELECT * FROM books ");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }

       
       public ResultSet searchrecord() {
                try {
          stmt = DBConnection.getStatementConnection();
          rs = stmt.executeQuery("SELECT * FROM record ");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }
      
}
