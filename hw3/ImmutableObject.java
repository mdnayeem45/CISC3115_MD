/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.immutableobject;

/**
 *
 * @author mdazizulhakimnayeem
 */
import java.util.Scanner;
public class ImmutableObject {
        public static void main(String[] args) {
        // Step 2: Declare a 2D array containing two arrays
        String[][] myArray = {
            {"BMW", "Ferrari", "Lambo"},
            {"pizza", "burger", "dumpling"}
        };
        
        // Step 3: Declare two String variables
        String isin;
        String inputwords;
        
        // Step 4: Print out the sentence
        System.out.println("Enter a word: ");
        
        // Step 5: Read input from the user
        Scanner scanner = new Scanner(System.in);
        inputwords = scanner.nextLine();
        
        // Check if the input is "STOP" to terminate the program
        if (inputwords.equalsIgnoreCase("STOP")) {
            StopChecking();
        } else {
            // Check if the input is in the 2D array
            isin = checkInputInArray(inputwords, myArray);
            if (isin.equals("True")) {
                System.out.println(inputwords + " is in the 2D array");
            } else {
                System.out.println(inputwords + " is not in the 2D array");
            }
        }
    }
    
    // Step 1: Method to stop checking
    public static void StopChecking() {
        System.out.println("Terminating the program.");
        System.exit(0);
    }
    
    // Method to check if the input is in the 2D array
    public static String checkInputInArray(String input, String[][] array) {
        for (String[] subArray : array) {
            for (String item : subArray) {
                if (item.equalsIgnoreCase(input)) {
                    return "True";
                }
            }
        }
        return "False";
    }
}
       
    
