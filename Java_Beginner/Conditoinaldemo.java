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
public class Conditoinaldemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,large;
        System.out.print("Enter two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        large = (num1 > num2) ? num1 : num2;
        
        System.out.println("Large Number: "+large);
    }
}
