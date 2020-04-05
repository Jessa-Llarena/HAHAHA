
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
public class Ass2 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number you would like to multiply: ");
        int number=scan.nextInt();
        int i,total;
        for (i=1; i<=10; i++)
        {
         total=number*i;
     System.out.println(number + "x" + i  + "=" + total);
        }
    }
}
