/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         String z;
         
         int x;
         int y;
         
        System.out.print("Enter Daddy's amount of money : ");

        x = sc.nextInt();
        
        System.out.print("Enter Mommy's amount of money : ");

        y = sc.nextInt();
        
        System.out.print("Enter Mommy's name : ");
        z = sc.next();
               1
        System.out.println("Total : " + (x+y));
        System.out.println(z);
    }
}
