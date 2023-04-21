package client;

import adt.*;
import entity.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        LinkedListAdminList linkedAdminList = new LinkedListAdminList();
        Scanner sc = new Scanner(System.in);
        linkedAdminList.addAdmin("Broyan", "admin");
        linkedAdminList.addAdmin("Danial", "moderator");
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
                // linkedAdminList.login("Broyan", "admin");
                if (true) {
                    System.out.println("You've logged in as: " + name);
                }
                adminMenu();
                break;
            case "2":
                System.out.println("To be added");
                break;
            case "3":
                System.out.println("Have a good day!");
                break;
        }
    }

    public static void adminMenu() {
        Scanner sc = new Scanner(System.in);
        String selection;
        System.out.println("*********************************************************");
        System.out.println("Admin Menu ");
        System.out.println("*********************************************************");
        System.out.println("\n*********************************************************");
        System.out.println("*\t[1]\tAdd Candidate\t\t\t*");
        System.out.println("*\t[2]\tRemove Candidate\t\t\t*");
        System.out.println("*\t[3]\tAdd Admin\t\t\t*");
        System.out.println("*\t[4]\tExit\t\t\t*");
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
            if (result < 1 | result > 4) {
                System.out.print("\nInvalid input! Please select the numbers available. ");
            } else {
                break;
            }
        }

    }
}
