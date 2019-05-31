/*
 * WIP XI Computer Programing 
 */

package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter cargo limit: ");
        int limit = sc.nextInt();
        
       
        int item = 0;
        String menulist = "--- MENU ---\n1.Add\n2.Remove\n3.Show Cargo Description\n4.Show Menu List\n5.Config Limit of Cargo\n6.Exit\n------------";
   
        System.out.println("Item in Cargo: " + item);
        System.out.println("Limit of Cargo: " + limit);
        
        
        
        System.out.println(menulist);
        System.out.println(" ");
        System.out.print("Enter menu: ");
        String menu = sc.next();
        //String menu = sc.nextLine();
        
        while( true ) {
            if (menu.equals("1")) {
                if (item < limit) {
                    System.out.print("Enter amount of item to add: ");
                    int amount = sc.nextInt();
                    int chkadd = item + amount;
                    if (chkadd <= limit) {
                        item += amount;
                        System.out.println("Item in Cargo: " + item);
                    } else {
                        System.out.println("Err: Unavailable to remove item in cargo. Entered amount is greater than limit of cargo.");
                    }
                } else {
                    System.out.println("Cargo is full.");
                }
            } else if (menu.equals("2")) {
                System.out.print("Enter amount of item to remove: ");
                int amount = sc.nextInt();
                if (amount <= item){
                    item -= amount;
                     System.out.println("Item in Cargo: " + item);

                } else {
                     System.out.println("Err: Unavailable to remove item in cargo. Entered amount is greater than items in cargo.");
                }
         
            } else if (menu.equals("3")) {
                System.out.println("Item in Cargo: " + item);
                System.out.println("Cargo Limit: " + limit);
            } else if (menu.equals("4")) {
                System.out.println(menulist);
            } else if (menu.equals("5")) {
                System.out.print("Enter new cargo limit: ");
                int amount = sc.nextInt();
                limit = amount;
            } else if (menu.equals("6")) {
                System.out.print("Are you sure to exit? [Y/N]");
                String confirm = sc.next();
                if (confirm.equals("Y") || confirm.equals("y")) {
                    break;
                }
            }
            
            else {
                System.out.println("Your entered answer is not in list of menu");
            }
            System.out.println(" ");
            System.out.print("Enter menu: ");
            menu = sc.next();
        }
             
        

    }
}
