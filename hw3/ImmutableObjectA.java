/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.immutableobjecta;

/**
 *
 * @author mdazizulhakimnayeem
 */
public class ImmutableObjectA {

    public static void main(String[] args) {
        float fahrenheit;
        float centigrade;

        fahrenheit = 98.6f;

        centigrade = (5.0f / 9.0f) * (fahrenheit - 32.0f);

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Centigrade: " + centigrade);

        System.out.println("Centigrade values from 0.0 to 40.0:");
        for (float i = 0.0f; i <= 40.0f; i += 4.0f) {
            float c = (5.0f / 9.0f) * (i - 32.0f);
            System.out.println("Fahrenheit: " + i + " Centigrade: " + c);
        }

        System.out.println("Centigrade values from 0.0 to 40.0 (using while loop):");
        float i = 0.0f;
        while (i <= 40.0f) {
            float c = (5.0f / 9.0f) * (i - 32.0f);
            System.out.println("Fahrenheit: " + i + " Centigrade: " + c);
            i += 4.0f;
        }
    }
}
    

