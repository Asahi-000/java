/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.feliseldafibo;
import java.util.Scanner;
/**
 *
 * @author CL3-PC12
 */
public class FeliseldaFIBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = input.nextInt();
        
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci series: ");
        
        for (int i=1; i<= numTerms; i++)
        {
            System.out.println(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        
    }
}
