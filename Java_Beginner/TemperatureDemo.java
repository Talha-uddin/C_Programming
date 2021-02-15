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
public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double cels,farn;
        
        System.out.print("Celsius: ");
        cels = input.nextDouble();
        
        farn = 1.8 * cels + 32;
        
        System.out.println("Farenhite: "+farn);
        
    }
}
