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
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter Any Number: ");
        num = input.nextInt();
        int count = 0;
        
        for(int i=2; i<num; i++){
            if(num % i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }
    }

}
