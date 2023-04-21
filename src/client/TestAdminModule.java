package client;

import adt.LinkedListAdminList;
import java.util.Scanner;

public class TestAdminModule {
    public static void main(String[] args) {
        String name;
        String pwd;

        LinkedListAdminList linkedAdminList = new LinkedListAdminList();
        Scanner sc = new Scanner(System.in);
        linkedAdminList.addAdmin("Broyan", "admin");
        System.out.print("Enter a username to register as admin: ");
        name = sc.nextLine();
        System.out.print("Enter a password to register as admin: ");
        pwd = sc.nextLine();

        linkedAdminList.addAdmin(name, pwd);

        linkedAdminList.displayAdminList();
        System.out.print("Enter a username to register as admin: ");
        name = sc.nextLine();
        System.out.print("Enter a password to register as admin: ");
        pwd = sc.nextLine();

        linkedAdminList.addAdmin(name, pwd);
    }
}
