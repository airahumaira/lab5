
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class lab5_act4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dateInput = JOptionPane.showInputDialog("Enter a date (DD/MM/YYYY:");
        
        String [] dateParts = dateInput.split("/");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        
        if (month == 1 || month == 2){
            month += 12;
            year -= 1;
        }
        //int century = year / 100;
        //int yearCentury = year % 100;
        int k = year % 100;
        int j = year / 100;
        int h = (day + (13 * (month +1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
        
        if (h < 0){
            h += 7;
        }
        
        
        String [] weekDay = {"SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"};
        String weekDays = weekDay[h];
        JOptionPane.showMessageDialog(null, "Day of the Week:" + weekDays);
        
        
    }
    
    
}
