
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class lab5_act5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String usersName = scanner.nextLine();
        
        System.out.println("Choose type of wood:");
        System.out.println("MAHOGANY OR OAK");
        String woodName = scanner.nextLine();
        
        System.out.println("Enter number of characters:");
        int numChar = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter chosen color for the characters:");
        String ColorCharacter = scanner.nextLine();
        
        double price = 30.0;
        
        if (woodName.equals("MAHOGANY")){
            price += 10.0;
        } else if (woodName.equals("OAK")){
            price += 15.0;
        }
        
        if (numChar > 6) {
            price += (numChar - 6) * 3.0;
        }
        
        if (ColorCharacter.equals("GOLD")){
            price += 12.0;
        }
        
        System.out.println("\n********** RECEIPT **********");
        System.out.println("Customer:" + usersName);
        System.out.println("Type of wood: ");
        System.out.println("OAK /"
                + " MAHOGANY - " + woodName);
        System.out.println("Enter number of characters:" + numChar);
        System.out.println("Enter chosen color for the characters:" + ColorCharacter);
        System.out.println("Total Price Signboard: RM" + String.format("%.2f%n", price));
        
        
        
        
    }
    
}
