
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
public class Ass3b {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan= new Scanner(System.in);
         System.out.println("How many numbers you would like to enter: ");
             int times=scan.nextInt();
         
        int i,PosNum=0,NegNum=0,ZerNum=0;
        System.out.println("Enter Number: ");
        for (i=1; i<=times; i++)
        {
            Scanner input=new Scanner(System.in);
             int num=input.nextInt();
            if(num<0)
            {
                NegNum++;
            }
             if (num>0)
             {
                 PosNum++;
             }
             if (num==0)
             {
                 ZerNum++;
             }
        }
       System.out.println("total number 101of Negative:" + NegNum);
         System.out.println("total number of Positive:" + PosNum);
           System.out.println("total number of Zeroes:" + ZerNum);
    }
    
}
