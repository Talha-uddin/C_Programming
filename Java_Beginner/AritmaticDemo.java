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
public class AritmaticDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1,num2,result;
        
        System.out.println("Enter First Numebr: ");
        num1 = input.nextInt();
        System.out.println("Enter Second Numebr: ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        result = num1 - num2;
        System.out.println("Sum = "+result);
        result = num1 * num2;
        System.out.println("Multiplication = "+result);
        double result2 = (double) num1 / num2;
        System.out.println("Div = "+result2);
        result = num1 % num2;
        System.out.println("Remineder = "+result);
    }
            
}
