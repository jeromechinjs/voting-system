package adt;

/* 
    @author Chong Yen Khang
 */
import java.util.List;

public class LinkedList {

    // Admin class to hold admin account details
    private static class Admin {
        String username;
        String password;

        // Constructor
        public Admin(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    // Candidate class to hold candidate details
    private static class Candidate {
        String name;
        String dptCode;
        Candidate next;

        // Constructor
        public Candidate(String name, String dptCode) {
            this.name = name;
            this.dptCode = dptCode;
            this.next = null;
        }
    }

    // LinkedList to hold all admin accounts
    private static class AdminList {
        Node head;

        // Constructor
        public AdminList() {
            this.head = null;
        }

        // Method to add a new admin account

        public void addAdmin(Admin newAdmin) {
            if (newAdmin == null) {
                System.out.println("Admin cannot be null");
                return;
            }
            if (head == null) {
                head = new Node(newAdmin);
            } else {
                Node current = head;
                while (current.next != null) {
                    if (current.data.equals(newAdmin)) {
                        System.out.println("Admin already exists");
                        return;
                    }
                    current = current.next;
                }
                if (current.data.equals(newAdmin)) {
                    System.out.println("Admin already exists");
                    return;
                }
                current.next = new Node(newAdmin);
            }
        }

        public void removeAdmin(Admin adminToRemove) {
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
                System.out.println(current.data.toString());
                current = current.next;
            }
        }

        private class Node {
            private Admin data;
            private Node next;

            public Node(Admin data) {
                this.data = data;
                this.next = null;
            }
        }
    }

    // LinkedList to hold all candidates
    private static class CandidateList {
        Candidate head;

        // Constructor
        public CandidateList() {
            this.head = null;
        }

        // Method to add a new candidate
        public void addCandidate(Candidate newCandidate) {
            if (head == null) {
                head = newCandidate;
            } else {
                Candidate current = head;
                Candidate previous = null;
                while (current != null && newCandidate.name.compareTo(current.name) > 0) {
                    previous = current;
                    current = current.next;
                }
                if (previous == null) {
                    newCandidate.next = head;
                    head = newCandidate;
                } else {
                    previous.next = newCandidate;
                    newCandidate.next = current;
                }
            }
        }

        // Method to update a candidate's details
        public void updateCandidate(int index, String newName, String dptCode) {
            Candidate current = head;
            int i = 0;
            while (current != null && i < index) {
                current = current.next;
                i++;
            }
            if (current != null) {
                current.name = newName;
                current.dptCode = dptCode;
            }
        }

        // Method to remove a candidate from the list
        public void removeCandidate(int index) {
            if (index == 0) {
                head = head.next;
            } else {
                Candidate current = head;
                Candidate previous = null;
                int i = 0;
                while (current != null && i < index) {
                    previous = current;
                    current = current.next;
                    i++;
                }
                if (current != null) {
                    previous.next = current.next;
                }
            }
        }

        // Method to display all candidates
        public void displayCandidates() {
            Candidate current = head;
            while (current != null) {
                System.out.println(current.name + " (" + current.dptCode + ")");
                current = current.next;
            }
        }
    }

    // AdminList to hold all admin accounts
    private AdminList admins = new AdminList();

    // CandidateList to hold all candidates
    private CandidateList candidates = new CandidateList();

    // Method to create a new admin account
    public void createAdmin(String username, String password) {
        Admin newAdmin = new Admin(username, password);
    }
}
