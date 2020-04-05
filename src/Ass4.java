
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
public class Ass4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
            System.out.println("Enter numbers of array: ");
            Scanner array= new Scanner(System.in);
            int n = array.nextInt();
            int a[]= new int[n];
            int b[]= new int[n];
            int temp=0;
            for( int i=0; i<n; i++)
            {
              System.out.print("Enter "+ i +" element of the array: ");
              a[i]=array.nextInt();
              b[i]= a[i];
             
            }
        
            for( int i=0; i<n; i++)
            {
               for( int j = i+1; j<n; j++) 
               {
                if (a[i] > a[j])
                {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
                }
               }
            }
            
            System.out.println("original: ");
            for( int i=0; i<n; i++)
            {
                System.out.println(b[i]+ " ");
            }
            System.out.println("Sorted: ");
             for( int i=0; i<n; i++)
            {
              System.out.println(a[i]+ " ");
            }
    }
}



