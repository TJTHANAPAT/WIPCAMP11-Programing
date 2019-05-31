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
        
        int limit = 10;
        int item = 5;
        String menulist = "--- MENU ---\n1.Add\n2.Remove\n3.Show Cargo Description\n4.Show Menu List\n5.Exit\n------------";
   
        System.out.println("Item in Cargo: " + item);
        System.out.println("Limit of Cargo: " + limit);
        
        
        
        System.out.println(menulist);
        System.out.print("Enter menu: ");
        int menu = sc.nextInt();
        //String menu = sc.nextLine();
        
        while( true ) {
            if (menu == 1) {
                if (item < limit) {
                    System.out.print("Enter Amount of item to add: ");
                    int amount = sc.nextInt();
                    int chkadd = item + amount;
                    if (chkadd <= limit) {
                        item += amount;
                        System.out.println("Item in Cargo: " + item);
                    } else {
                        System.out.println("Unavailable to add item in cargo.");
                    }
                } else {
                    System.out.println("Cargo is full.");
                }
            } else if (menu == '2') {
                System.out.print("Enter Amount of item to remove: ");
                int amount = sc.nextInt();
                if (amount <= item){
                    item -= amount;
                     System.out.println("Item in Cargo: " + item);

                } else {
                     System.out.println("Unavailable to remove item in cargo.");
                }
         
            } else if (menu == 3) {
                System.out.println("Item in Cargo: " + item);
                System.out.println("Limit of Cargo: " + limit);
            } else if (menu == 4) {
                System.out.println(menulist);
            }
            else if (menu == 5) {
                System.out.print("Are you sure to exit program? [Y/N]");
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
            menu = sc.nextInt();
        }
             
        
        
        
        
        
        
        /**
        int age = 18;
        String name = "Wippo";
        double money = 1100.11;
        
        boolean online = true;
        String status;
        
        System.out.println("Hi! my name is " + name + " i'm " + age + " Y/O ");
        
        if(online == true){
            status = "Online";
        } else {
            status = "Offline";
        }
        
        System.out.println("I'm currently " + status + " and have " + money + "THB. left.");
        * */
    }
}
