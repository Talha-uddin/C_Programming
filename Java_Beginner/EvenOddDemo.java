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
public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive Integer: ");
        num = input.nextInt();
        
        if(num%2 == 0){
        System.out.println("Even");
        }
        else{
        System.out.println("Odd");
        }
    }
}
