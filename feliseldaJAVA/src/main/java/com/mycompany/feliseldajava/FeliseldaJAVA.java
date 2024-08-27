/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.feliseldajava;
import java.util.Scanner;
/**
 *
 * @author CL3-PC12
 */
public class FeliseldaJAVA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int c1,c2;
        System.out.println("Menu");
        System.out.println("[1] = Snacks");
        System.out.println("[2] = Drinks");
        
        //output
        
        System.out.println("Enter your choice: ");
        c1 = input.nextInt();
        
        if (c1==1)
        {
            
            System.out.println("[1] Piatos = 20");
            System.out.println("[2] Nova = 13");
            System.out.println("Enter your choice: ");
            c2 = input.nextInt();
            
            if (c2==1)
            {
                System.out.println("Piatos 20 pesos");
                int pia, nova;
                pia = 20;
                nova = 13;
                
                System.out.println("Would you like to order drinks? [1] Yes [2] No");
                int c3 = input.nextInt();
                
                if (c3==1)
                {
                    System.out.println("[1] Coke = 25");
                    System.out.println("[2] Water = 27");
                    System.out.println("Enter your choice: ");
                    
                    int c4 = input.nextInt();
                    
                    if (c4==1)
                    {
                        System.out.println("Coke 25 pesos");
                        int coke, water;
                        coke = 25;
                        water = 27;
                        
                        int tot;
                        tot = pia + coke;
                        System.out.println("Your total is " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                            while (csh<tot)
                            {
                                System.out.println("Try again.");
                                System.out.println("Enter your cash: ");
                                csh = input.nextInt();
                            }
                            if (csh>=tot)
                            {
                                int chng;
                                chng = csh - tot;
                                System.out.println("Change is: "+ chng);
                            }
                    }
                    else if (c4==2)
                    {
                        System.out.println("Water 27 pesos");
                        int coke, water;
                        coke = 25;
                        water = 27;
                        
                        int tot;
                        tot = pia + water;
                        System.out.println("Your total is " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                            while (csh<tot)
                            {
                                System.out.println("Try again.");
                                System.out.println("Enter your cash: ");
                                csh = input.nextInt();
                            }
                            if (csh>=tot)
                            {
                                int chng;
                                chng = csh - tot;
                                System.out.println("Change is: "+ chng);
                            }
                    }   
                }
                else if (c3==2)
                {
                    int tot;
                    tot = pia;
                    System.out.println("Your total is " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                    
                        while (csh<tot)
                        {
                            System.out.println("Try again.");
                            System.out.println("Enter your cash: ");
                            csh = input.nextInt();
                        }
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is: "+ chng);
                        }
                }
                
            }
            else if (c2==2)
            {
                System.out.println("Nova 13 pesos");
                int pia, nova;
                pia = 20;
                nova = 13;
                
                System.out.println("Would you like to order drinks? [1] Yes [2] No");
                int c3 = input.nextInt();
                
                if (c3==1)
                {
                    System.out.println("[1] Coke = 25");
                    System.out.println("[2] Water = 27");
                    System.out.println("Enter your choice: ");
                    
                    int c4 = input.nextInt();
                    
                    if (c4==1)
                    {
                        System.out.println("Coke 25 pesos");
                        int coke, water;
                        coke = 25;
                        water = 27;
                        
                        int tot;
                        tot = nova + coke;
                        System.out.println("Your total is " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                            while (csh<tot)
                            {
                                System.out.println("Try again.");
                                System.out.println("Enter your cash: ");
                                csh = input.nextInt();
                            }
                            if (csh>=tot)
                            {
                                int chng;
                                chng = csh - tot;
                                System.out.println("Change is: "+ chng);
                            }
                    }
                    if (c4==2)
                    {
                        System.out.println("Water 27 pesos");
                        int coke, water;
                        coke = 25;
                        water = 27;
                        
                        int tot;
                        tot = nova + water;
                        System.out.println("Your total is " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                            while (csh<tot)
                            {
                                System.out.println("Try again.");
                                System.out.println("Enter your cash: ");
                                csh = input.nextInt();
                            }
                            if (csh>=tot)
                            {
                                int chng;
                                chng = csh - tot;
                                System.out.println("Change is: "+ chng);
                            }
                    }
                }
                else if (c3==2)
                {
                    int tot;
                    tot = nova;
                    System.out.println("Your total is " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                    
                        while (csh<tot)
                        {
                            System.out.println("Try again.");
                            System.out.println("Enter your cash: ");
                            csh = input.nextInt();
                        }
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is: "+ chng);
                        }
                }
                
            }
        }
        if (c1==2)
        {
            System.out.println("[1] Coke = 25");
            System.out.println("[2] Water = 27");
            System.out.println("Enter your choice: ");
            
            c2 = input.nextInt();
            
            if (c2==1)
            {
                System.out.println("Coke 25 pesos");
                int coke, water;
                coke = 25;
                water = 27;
                
                System.out.println("Would you like to order snacks? [1] Yes [2] No");
                int c3 = input.nextInt();
                
                if (c3==1)
                {
                    System.out.println("[1] Piatos = 20");
                    System.out.println("[2] Nova = 13");
                    System.out.println("Enter your choice: ");
                    int c4 = input.nextInt();
                    
                    if (c4==1)
                    {
                        System.out.println("Piatos 20 pesos");
                        int pia, nova;
                        pia = 20;
                        nova = 13;
                        
                        int tot;
                        tot = pia + coke;
                        System.out.println("Your total is " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                            while (csh<tot)
                            {
                                System.out.println("Try again.");
                                System.out.println("Enter your cash: ");
                                csh = input.nextInt();
                            }
                            if (csh>=tot)
                            {
                                int chng;
                                chng = csh - tot;
                                System.out.println("Change is: "+ chng);
                            }
                    }
                    if (c4==2)
                    {
                        System.out.println("Nova 27 pesos");
                        int pia, nova;
                        pia = 20;
                        nova = 13;
                        
                        int tot;
                        tot = nova + coke;
                        System.out.println("Your total is " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                            while (csh<tot)
                            {
                                System.out.println("Try again.");
                                System.out.println("Enter your cash: ");
                                csh = input.nextInt();
                            }
                            if (csh>=tot)
                            {
                                int chng;
                                chng = csh - tot;
                                System.out.println("Change is: "+ chng);
                            }
                    }
                }
                else if (c3==2)
                {
                    int tot;
                    tot = coke;
                    System.out.println("Your total is " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                    
                        while (csh<tot)
                        {
                            System.out.println("Try again.");
                            System.out.println("Enter your cash: ");
                            csh = input.nextInt();
                        }
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is: "+ chng);
                        }
                }
            }
            if (c2==2)
            {
                System.out.println("Water 27 pesos");
                int coke, water;
                coke = 25;
                water = 27;
                
                System.out.println("Would you like to order snacks? [1] Yes [2] No");
                int c3 = input.nextInt();
                
                if (c3==1)
                {
                    System.out.println("[1] Piatos = 20");
                    System.out.println("[2] Nova = 13");
                    System.out.println("Enter your choice: ");
                    int c4 = input.nextInt();
                    
                    if (c4==1)
                    {
                        System.out.println("Piatos 20 pesos");
                        int pia, nova;
                        pia = 20;
                        nova = 13;
                        
                        int tot;
                        tot = pia + water;
                        System.out.println("Your total is " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                            while (csh<tot)
                            {
                                System.out.println("Try again.");
                                System.out.println("Enter your cash: ");
                                csh = input.nextInt();
                            }
                            if (csh>=tot)
                            {
                                int chng;
                                chng = csh - tot;
                                System.out.println("Change is: "+ chng);
                            }
                    }
                    if (c4==2)
                    {
                        System.out.println("Nova 13 pesos");
                        int pia, nova;
                        pia = 20;
                        nova = 13;
                        
                        int tot;
                        tot = nova + water;
                        System.out.println("Your total is " + tot);
                        System.out.println("Enter your cash: ");
                        int csh = input.nextInt();
                            while (csh<tot)
                            {
                                System.out.println("Try again.");
                                System.out.println("Enter your cash: ");
                                csh = input.nextInt();
                            }
                            if (csh>=tot)
                            {
                                int chng;
                                chng = csh - tot;
                                System.out.println("Change is: "+ chng);
                            }
                    }
                }
                else if (c3==2)
                {
                    int tot;
                    tot = water;
                    System.out.println("Your total is " + tot);
                    System.out.println("Enter your cash: ");
                    int csh = input.nextInt();
                    
                        while (csh<tot)
                        {
                            System.out.println("Try again.");
                            System.out.println("Enter your cash: ");
                            csh = input.nextInt();
                        }
                        if (csh>=tot)
                        {
                            int chng;
                            chng = csh - tot;
                            System.out.println("Change is: "+ chng);
                        }
                }
            }
        }        
    }
}
