package controller;

import javax.swing.JOptionPane;
import model.AddPatient; 

public class AddpatientController {
    public static void patient(String Pname, String Pnum, String Dname, String category, String payment) {
        new AddPatient().Patient(Pname, Pnum, Dname, category, payment);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
}
