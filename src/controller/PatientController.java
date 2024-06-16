
package controller;
import javax.swing.JOptionPane;

public class PatientController {
    public static void Form(String name, String address, String gender, String age) {
        
        if (name == null || name.trim().isEmpty() ||
            address == null || address.trim().isEmpty() ||
            gender == null || gender.trim().isEmpty() ||
            age == null || age.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
 new model.AddRecord().Form(name, address, gender, age);
 JOptionPane.showMessageDialog(null, "New Record hasbeen inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
} 

    public static void Form(String text, String text0, String text1, String gender, String appointment) {
        
        if (text == null || text.trim().isEmpty() ||
            text0 == null || text0.trim().isEmpty() ||
            text1 == null || text1.trim().isEmpty() ||
            gender == null || gender.trim().isEmpty() ||
            appointment == null || appointment.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
       new model.AddRecord().APPoint(text, text0,text1, gender, appointment );
       JOptionPane.showMessageDialog(null, "New Record hasbeen inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
  
    public static void record(String patient_Name, String Pnum, String ptrea, String danme, String patient_payment_info) {
        
        if (patient_Name == null || patient_Name.trim().isEmpty() ||
            Pnum == null || Pnum.trim().isEmpty() ||
            ptrea == null || ptrea.trim().isEmpty() ||
            danme == null || danme.trim().isEmpty() ||
            patient_payment_info == null || patient_payment_info.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled out", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

       new model.AddRecord().record(patient_Name, Pnum,ptrea, danme,  patient_payment_info );
       JOptionPane.showMessageDialog(null, "New Record hasbeen inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
    
}
