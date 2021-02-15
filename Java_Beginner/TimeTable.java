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
public class TimeTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.print("Enter initial number: ");
        m = input.nextInt();
        System.out.print("Enter final number: ");
        n = input.nextInt();
        
        for(int i=m; i<=n; i++){
            for(int j=1; j<=10; j++){
            System.out.println(i+"X"+j+" = "+i*j);
            }
            System.out.println("\n\n");
        }
        
        
        }
    }

