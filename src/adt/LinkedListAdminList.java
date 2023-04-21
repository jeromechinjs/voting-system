package adt;

/* 
    @author Chong Yen Khang
 */

public class LinkedListAdminList implements LinkedListInterface {

    // Admin class to hold admin account details
    public static class Admin {
        private String username;
        private String password;

        public Admin(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    private Node head;

    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addAdmin(String username, String password) {
        if (username == null) {
            System.out.println("Admin cannot be null");
            return;
        }
        if (head == null) {
            head = new Node(username);
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.data.equals(username)) {
                    System.out.println("Admin already exists");
                    return;
                }
                current = current.next;
            }
            if (current.data.equals(username)) {
                System.out.println("Admin already exists");
                return;
            }
            current.next = new Node(username);
        }
    }

    public void removeAdmin(String adminToRemove) {
        if (adminToRemove == null) {
            System.out.println("Admin cannot be null");
            return;
        }
        if (head == null) {
            System.out.println("Admin list is empty");
            return;
        } else if (head.data.equals(adminToRemove)) {
            head = head.next;
            return;
        } else {
            Node prev = head;
            Node current = head.next;
            while (current != null) {
                if (current.data.equals(adminToRemove)) {
                    prev.next = current.next;
                    return;
                }
                prev = current;
                current = current.next;
            }
            System.out.println("Admin not found in list");
        }
    }

    public void displayAdminList() {
        if (head == null) {
            System.out.println("Admin list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            int i = 1;
            System.out.println("***************");
            System.out.println("*List of Admin*");
            System.out.println("***************");
            System.out.println(i + ".\t" + current.data.toString());
            current = current.next;
            i++;
        }
    }

    public boolean login(String username, String password) {
        if (head == null) {
            System.out.println("Admin list is empty");
            return false;
        } else {
            Node current = head;
            while (current != null) {
                if (current.data.equals(username) && current.data.equals(password)) {
                    System.out.println("Login successful");
                    return true;
                }
                current = current.next;
            }
            System.out.println("Invalid username or password");
            return false;
        }
    }
}