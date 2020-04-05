/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
    // * and open the template in the editor.
 */
package assigment;

/**
 *
 * @author Jessa Llarena
 */
public class Assigment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,sum=0,even=0, odd=0;
       for ( i=1; i<=5; i++)
       {
           System.out.println(i);
            sum +=i;
        if ( i%2==0)
        {
            ++even;
        }
        else
        {
            ++odd;
        }
       }
        System.out.println("Sum of the numbers is: "+sum);
        System.out.println("No of Even NUmbers is :" + even);
         System.out.println("No of odd NUmbers is :" + odd);
    }
    }
    

