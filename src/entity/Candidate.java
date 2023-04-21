package entity;

public class Candidate {
    // Candidate class to hold candidate details
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
