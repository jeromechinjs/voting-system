package adt;

public class LinkedListCandidates implements CandidateLinkedListInterface {

    private Node head;

    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new candidate
    public void addCandidate(String newCandidate) {
        if (head == null) {
            head = new Node(newCandidate);
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.data.equals(newCandidate)) {
                    System.out.println("Candidate already exists");
                    return;
                }
                current = current.next;
            }
            if (current.data.equals(newCandidate)) {
                System.out.println("Candidate already exists");
                return;
            }
            current.next = new Node(newCandidate);
        }
    }

    // Method to remove a candidate from the list
    public void removeCandidate(String candidateToRemove) {
        if (candidateToRemove == null) {
            System.out.println("Candidate cannot be null");
            return;
        }
        if (head == null) {
            System.out.println("Candidate list is empty");
            return;
        } else if (head.data.equals(candidateToRemove)) {
            head = head.next;
            return;
        } else {
            Node prev = head;
            Node current = head.next;
            while (current != null) {
                if (current.data.equals(candidateToRemove)) {
                    prev.next = current.next;
                    return;
                }
                prev = current;
                current = current.next;
            }
            System.out.println("Candidate not found in list");
        }
    }

    // Method to display all candidates
    public void displayCandidateList() {
        if (head == null) {
            System.out.println("Candidate list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }
}
