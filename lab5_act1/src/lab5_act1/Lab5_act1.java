/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5_act1;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Lab5_act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        
        String inputIdentity = JOptionPane.showInputDialog("Enter IC Number");
        
        String yearPart = inputIdentity.substring(0,2);
        String monthPart = inputIdentity.substring(2,4);
        String dayPart = inputIdentity.substring(4,6);
        
        int birthYear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);
            //birthYear <= 24
        if (birthYear <= 24){
            birthYear += 2000;
                   //birthYear > 25
        } else if (birthYear > 25){
         
            birthYear += 1900;
            
        } else
        System.out.println("THIS IC NUMBER IS INVALID");
        
        int age = currentYear - birthYear;
        String message = String.format("Birthdate is %02d-%02d-%d\n Age is %d", day, month, birthYear, age);
        JOptionPane.showMessageDialog(null, message);
    }
    
}
