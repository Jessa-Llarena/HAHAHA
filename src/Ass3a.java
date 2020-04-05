
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessa Llarena
 */
public class Ass3a {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Divisible by 3: ");
        int a,b,c;
        for(a=1; a<=100; a++)
        {
         if (a%3==0)
         {
          System.out.print(a + ", ");
         }
        }
         System.out.println();
         System.out.println("Divisible by 5: ");
         for(b=1; b<=100; b++)
         {
         if (b%5==0)
         {
          System.out.print(b + ", ");   
         }
         }
         System.out.println();
         System.out.println("Divisible by Both: ");
         for(c=1; c<=100; c++)
         {
         if (c%3==0 && c%5==0)
         {
         System.out.print(c + ", ");  
         }
         }
         
        }
}
    

   




