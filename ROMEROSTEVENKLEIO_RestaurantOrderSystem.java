/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romero.stevenkleio_restaurantordersystem;

import java.util.Scanner;

/**
 *
 * @author M303User
 */
public class ROMEROSTEVENKLEIO_RestaurantOrderSystem {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuSelection;
        double totalCost = 0;
        System.out.println("\nMENU");
        System.out.println("1. Burger    - PHP 100");
        System.out.println("2. Fries     - PHP 50");
        System.out.println("3. Soda      - PHP 30");
        System.out.println("4. Ice Cream - PHP 45");
        System.out.println("5. Exit");
        System.out.print("Please enter the number of the item you wish to order: ");
        menuSelection = scanner.nextInt();
        if (menuSelection == 5) {
            System.out.println("Exiting the program.");
            scanner.close();
            return;  
        }
        int quantity;
        switch (menuSelection) {
            case 1:  
                System.out.print("Enter quantity for Burger: ");
                quantity = scanner.nextInt();
                totalCost = 100 * quantity;
                break;
            case 2:
                System.out.print("Enter quantity for Fries: ");
                quantity = scanner.nextInt();
                totalCost = 50 * quantity;
                break;
            case 3: 
                System.out.print("Enter quantity for Soda: ");
                quantity = scanner.nextInt();
                totalCost = 30 * quantity;
                break;
            case 4: 
                System.out.print("Enter quantity for Ice Cream: ");
                quantity = scanner.nextInt();
                totalCost = 45 * quantity;
                break;
            default:
                System.out.println("Invalid selection. Exiting the program.");
                scanner.close();
                return;
        }
        System.out.println("Total Bill: PHP " + totalCost);
        
        scanner.close();
    }
}
