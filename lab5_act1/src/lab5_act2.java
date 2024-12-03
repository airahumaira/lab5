
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class lab5_act2 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    int sales = 0;
    double rate = 0;
    
    System.out.println("Enter value of sales: ");
    sales = scanner.nextInt();
    
    if (sales > 10000){//(sales > 15000){
        rate = sales * 0.15; //sales * 0.20;
        
    } else if (sales > 15000){
            rate = sales * 0.20;
                      
    } else{
        rate = sales * 0.10;
                }
    
    System.out.println("Your rate: " + rate);
        
        
    }
    
}
