/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;




import javax.swing.JOptionPane;
import model.AsignDOC;

public class Assigncontroller {
    public static void ASSIGNDOCT(String doctor_name, String Treatement_type, String available_status, String time_period) {
        AsignDOC asignDOC = new AsignDOC();
        asignDOC.assigndoctor(doctor_name, Treatement_type, available_status, time_period);
        JOptionPane.showMessageDialog(null, "New Record hasbeen inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
    }
}

    


