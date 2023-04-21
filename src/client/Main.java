package client;

import adt.*;
import entity.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        LinkedListAdminList linkedAdminList = new LinkedListAdminList();
        LinkedListCandidates linkedCandidateList = new LinkedListCandidates();
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
        int select;
        while (true) {
            try {
                System.out.print("Selection (1/2/3): ");
                selection = sc.next();
                select = Integer.parseInt(selection);
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
                continue;
            }
            if (select < 1 | select > 3) {
                System.out.print("\nInvalid input! Please select the numbers available. ");
            } else {
                break;
            }
        }
        int temp = 0;
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
                    System.out.println("*********************************************************");
                    System.out.println("Admin Menu ");
                    System.out.println("*********************************************************");
                    System.out.println("\n*********************************************************");
                    System.out.println("*\t[1]\tAdd Candidate\t\t\t*");
                    System.out.println("*\t[2]\tRemove Candidate\t\t\t*");
                    System.out.println("*\t[3]\tDisplay Candidate\t\t\t*");
                    System.out.println("*\t[4]\tAdd Admin\t\t\t*");
                    System.out.println("*\t[5]\tExit\t\t\t*");
                    System.out.println("\n*********************************************************\n\n");
                    int result;
                    while (true) {
                        try {
                            System.out.print("Selection (1/2/3/4/5): ");
                            selection = sc.next();
                            result = Integer.parseInt(selection);
                        } catch (Exception e) {
                            System.out.println("Invalid input, please try again.");
                            continue;
                        }
                        if (result < 1 | result > 5) {
                            System.out.print("\nInvalid input! Please select the numbers available. ");
                        } else {
                            break;
                        }
                        temp = result;
                    }
                }
                break;
            case "2":
                System.out.println("To be added");
                break;
            case "3":
                System.out.println("Have a good day!");
                break;
        }

        switch (temp) {
            case 1:
                String repeat, checkSelect;
                int validate = 1;
                do {
                    String cName;
                    System.out.print("\nEnter Candidate Name: ");
                    cName = sc.next();
                    linkedCandidateList.addCandidate(cName);
                    System.out.println("Do you want to add more? 1 for yes 0 for no: ");
                    while (true) {
                        try {
                            System.out.print("Selection (0/1): ");
                            repeat = sc.next();
                            validate = Integer.parseInt(repeat);
                        } catch (Exception e) {
                            System.out.println("Invalid input, please try again.");
                            continue;
                        }
                        if (validate < 0 | validate > 1) {
                            System.out.print("\nInvalid input! Please select the numbers available. ");
                        } else {
                            break;
                        }
                    }
                } while (validate == 1);
                break;
            case 2:
                String cand;
                System.out.print("\nEnter Candidate Name: ");
                cand = sc.next();
                linkedCandidateList.removeCandidate(cand);
                break;
            case 3:
                linkedCandidateList.displayCandidateList();
                break;
            case 4:
                String aName, aPwd;
                System.out.print("\nEnter admin userame: ");
                aName = sc.next();
                System.out.print("\nEnter password for account: ");
                aPwd = sc.next();
                linkedAdminList.addAdmin(aName, aPwd);
        }
    }
}
