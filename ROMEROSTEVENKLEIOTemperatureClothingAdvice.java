/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romero.steven.kleio;

/**
 *
 * @author M303User
 */
import java.util.Scanner;

/**
 *
 * @author M303User
 */
public class ROMEROSTEVENKLEIOTemperatureClothingAdvice {
    public static void main(String[] args) {
        // This is the code that incodes your information
        Scanner scanner = new Scanner(System.in);
        // Your name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        // Your age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // And the Temperature
        System.out.print("Enter the temperature (°C): ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();  
        // This is where the code asks you fpr the weather and provides you the things you need for the condition
        System.out.print("Enter the special weather condition (rain, wind, clear): ");
        String weatherCondition = scanner.nextLine().toLowerCase();
        System.out.println("\nClothing advice for " + name + ":");
        if (temperature < 0) {
            System.out.println("Very cold, needs a heavy winter coat, gloves, and a scarf.");
        } else if (temperature >= 0 && temperature <= 15) {
            System.out.println("Chilly, light jacket needed.");
        } else if (temperature >= 16 && temperature <= 25) {
            System.out.println("Pleasant, sweater or light jacket is enough.");
        } else {
            System.out.println("Hot, comfortable and light clothes recommended.");
        }

        if (weatherCondition.equals("rain")) {
            System.out.println("Don't forget an umbrella!");
        } else if (weatherCondition.equals("wind")) {
            System.out.println("Be cautious of the wind, wear a windbreaker!");
        } else if (weatherCondition.equals("clear")) {
            System.out.println("It's a clear day, no additional weather advice.");
        } else {
            System.out.println("Invalid weather condition entered. Please enter rain, wind, or clear.");
        }
        
        scanner.close();
    }
}

