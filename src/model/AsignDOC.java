/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;

/**
 *
 * @author user
 */
public class AsignDOC {
    
    Statement stmt;
 public void assigndoctor(String mn, String bn, String status,String erdate) {
 try {
 stmt = DBConnection.getStatementConnection();
            System.out.println(mn + bn + status + erdate);
  
 stmt.executeUpdate("INSERT INTO assigndoctor VALUES ('" + mn +"','" + bn + "', '" + status + "', '" + erdate + "')");
 }                    catch (Exception e) {
                      e.printStackTrace(); }
 }

    
}
