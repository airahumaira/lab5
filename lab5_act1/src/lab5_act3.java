
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

public class lab5_act3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your Account Number:");
        String accountNum = scanner.nextLine();
        
        System.out.println("Enter your account type (S for Savings, C for Checking):");
        char accountType = scanner.next().charAt(0);
        
        System.out.println("Enter the minimum required balance:");
        double minBal = scanner.nextDouble();
        
        System.out.println("Enter your current balance:");
        double currBal = scanner.nextDouble();
        
        double newBalance = currBal;
        
        if (accountType == 'S') {
            if  (currBal < minBal) {
                 currBal -= 10; 
               System.out.println("Service charge of RM10 has been deducted from your account");
               
            } else {
                currBal += 0.04 * currBal;
                System.out.println("Interest of 4% has been added");
            }
        
        } else if (accountType == 'C'){
            if (currBal < minBal) {
                currBal -= 25;
                System.out.println("Service charge of 25% has been deducted.");
                
            } else {
                if (currBal > minBal + 5000) {
                    currBal += currBal * 0.05;
                    System.out.println("5% interest has been added");
                } else {
                    currBal += currBal * 0.03;
                    System.out.println("3% interest has been added");
                }
            }
        } else {
            System.out.println("Invalid Account type entered");
            scanner.close();
            return; // keluar kalau accType tu invalid
        } 
        
        System.out.println("\nAccount Details");
        System.out.println("Account Number:" + accountNum);
        System.out.println("Account Type:" + accountType);
        System.out.println("Current Balance: RM " + currBal);
        System.out.println("New Balance:" + newBalance);
        
        scanner.close();
    }
    
}
