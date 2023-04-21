package client;

import adt.*;
import java.util.Scanner;

public class TestAdminModule {
    public static void main(String[] args) {
        LinkedListAdminList linkedAdminList = new LinkedListAdminList();
        Scanner sc = new Scanner(System.in);
        linkedAdminList.addAdmin("Broyan", "admin");
        String name, pwd, selection;

        System.out.println("*********************************************************");
        System.out.println("Welcome to the Voting Kiosk. Please Select Your Login: ");
        System.out.println("*********************************************************");
        System.out.println("\n*********************************************************");
        System.out.println("*\t[1]\tAdmin\t\t\t*");
        System.out.println("*\t[2]\tStudent\t\t\t*");
        System.out.println("*\t[3]\tExit\t\t\t*");
        System.out.println("\n*********************************************************\n\n");
        int result;
        while (true) {
            try {
                System.out.print("Selection (1/2/3): ");
                selection = sc.next();
                result = Integer.parseInt(selection);
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
                continue;
            }
            if (result < 1 | result > 3) {
                System.out.print("\nInvalid input! Please select the numbers available. ");
            } else {
                break;
            }
        }
        switch (selection) {
            case "1":
                linkedAdminList.displayAdminList();
                System.out.print("Enter a username to login as admin: ");
                name = sc.next();
                System.out.print("Enter the password: ");
                pwd = sc.next();
                linkedAdminList.login(name, pwd);
                break;
            case "2":
                System.out.println("To be added");
                break;
            case "3":
                System.out.println("Have a good day!");
                break;
        }
        /*
         * System.out.print("Enter a username to register as admin: ");
         * name = sc.nextLine();
         * System.out.print("Enter a password to register as admin: ");
         * pwd = sc.nextLine();
         * 
         * linkedAdminList.addAdmin(name, pwd);
         */

    }

}
