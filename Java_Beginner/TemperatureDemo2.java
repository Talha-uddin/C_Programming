/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TemperatureDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double farn,cels;
        System.out.print("Enter Farenhite: ");
        farn = input.nextDouble();
        
        cels = 0.55 * farn - 32;
        System.out.println("Celcius: "+cels);
    }
}
