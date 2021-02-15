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
public class FibonacciSeries {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number: ");
        num = input.nextInt();
        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.print(first+" "+second);
        for(int i=3; i<=num; i++){
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
    }
}
