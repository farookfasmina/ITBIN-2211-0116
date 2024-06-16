
package model;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddRecord {
    Statement stmt;

public void Form(String name, String address, String gender,String age) {
         try {
               stmt = DBConnection.getStatementConnection();
               stmt.executeUpdate
               ("INSERT INTO patient VALUES('"+name+"', '"+address+"','"+gender+"', '"+age+"')");
        }        catch (Exception e) {
                 e.printStackTrace();
 }
}

public void register(String First_Name, String Last_Name, String E_mail,String Username , String password){
    try {
               stmt = DBConnection.getStatementConnection();
               stmt.executeUpdate
               ("INSERT INTO login VALUES('"+First_Name+"', '"+Last_Name+"','"+  E_mail+"', '"+Username+"','"+password+"')");
        }        catch (Exception e) {
                 e.printStackTrace();
 }
    
}
   

    public void APPoint(String PATIENT_NAME, String PATIENT_NUMBER, String PATIENT_GENDER, String DOCTOR_NAME, String DESCRIPTION) {
       try {
               stmt = DBConnection.getStatementConnection();
               stmt.executeUpdate
               ("INSERT INTO appointment VALUES('"+PATIENT_NAME+"', '"+PATIENT_NUMBER+"','"+  PATIENT_GENDER+"', '"+DOCTOR_NAME+"','"+	DESCRIPTION+"')");
        }        catch (Exception e) {
                 e.printStackTrace();
 }
    }

    public void record(String patient_Name, String Pnum, String ptrea, String danme, String patient_payment_info) {
        try {
               stmt = DBConnection.getStatementConnection();
               stmt.executeUpdate
               ("INSERT INTO record VALUES('"+patient_Name+"', '"+Pnum+"','"+  ptrea+"', '"+danme+"','"+patient_payment_info +"')");
        }        catch (Exception e) {
                 e.printStackTrace();
 }
    }
    


}