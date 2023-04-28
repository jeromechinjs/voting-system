package client;

import adt.*;
import entity.*;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String args[]) {
        LinkedListAdminList linkedAdminList = new LinkedListAdminList();
        LinkedListCandidates linkedCandidateList = new LinkedListCandidates();
        QueueInterface<VoteResultDataPair> voteResults = new ArrayQueue<VoteResultDataPair>();
        Voter voter = new Voter();
        
        Scanner sc = new Scanner(System.in);
        String name, pwd;
        int selection;
        String repeat = "y";

        linkedAdminList.addAdmin("Broyan", "admin");
        linkedAdminList.addAdmin("Danial", "moderator");

        // Test Data
        // Enqueue All Registered Candidates into array queue
        voteResults.enqueue(new VoteResultDataPair("candidate1", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate2", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate3", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate4", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate5", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate6", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate7", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate8", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate9", 0));


        while (repeat == "y") {
                    System.out.println("*********************************************************");
                    System.out.println("Welcome to the Voting Kiosk. Please Select Your Login: ");
                    System.out.println("*********************************************************");
                    System.out.println("\n*********************************************************");
                    System.out.println("*\t[1]\tAdmin\t\t\t*");
                    System.out.println("*\t[2]\tStudent\t\t\t*");
                    System.out.println("*\t[3]\tDisplay Results\t\t\t*");
                    System.out.println("*\t[4]\tExit\t\t\t*");
                    System.out.println("\n*********************************************************\n\n");
        
                //int select;
      
            while (true) {
                try {
                    System.out.print("Selection (1/2/3): ");
                    selection = sc.nextInt();
                    ///select = Integer.parseInt(selection);
                } catch (Exception e) {
                    System.out.println("Invalid input, please try again.");
                    continue;
                }
                if (selection < 1 | selection > 3) {
                    System.out.print("\nInvalid input! Please select the numbers available. ");
                } else {
                    break;
                }
            }
            switch (selection) {
                case 1:
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
                        System.out.println("*\t[1]\tAdd Candidate\t\t\t\t*");
                        System.out.println("*\t[2]\tRemove Candidate\t\t\t*");
                        System.out.println("*\t[3]\tDisplay Candidate\t\t\t*");
                        System.out.println("*\t[4]\tAdd Admin\t\t\t\t*");
                        System.out.println("*\t[5]\tExit\t\t\t\t\t*");
                        System.out.println("\n*********************************************************\n\n");
                        int sel;
                        System.out.print("Choose 1 - 5: ");
                        sel = sc.nextInt();
                        switch (sel) {
                            case 1:
                                String cName;
                                System.out.print("\nEnter Candidate Name: ");
                                cName = sc.next();
                                linkedCandidateList.addCandidate(cName);
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
                                System.out.print("\nEnter admin username: ");
                                aName = sc.next();
                                System.out.print("\nEnter password for account: ");
                                aPwd = sc.next();
                                linkedAdminList.addAdmin(aName, aPwd);
                                break;
                            case 5:
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nWelcome to Student Reistration and Login\n");
                
                    boolean cont = true;

                    do {
                        System.out.println("1. Student / Voter Registration");
                        System.out.println("2. Student / Voter Login");
                        System.out.print("Select your selection (1 / 2): ");
                        int opt = sc.nextInt();

                        if (opt == 1) {

                                System.out.println("\nStudent / Voter Registration Menu\n");
                               
                                System.out.print("Enter student id: ");
                                String registerId = sc.next();
                    
                                System.out.print("\nEnter student name: ");
                                String registerName = sc.next();
                    
                                System.out.print("\nEnter student faculty: ");
                                String faculty = sc.next();
                    
                                System.out.print("\nEnter password: ");
                                String registerPassword = sc.next();
                    
                                Voter voterInfo = new Voter(registerId, registerName, faculty, registerPassword);
                        
                                voter.addVoter(voterInfo);
            
                                
        
                                System.out.print("Do you want to return register or login? (y / n): ");
                                String yes = sc.next();
                                cont = "y".equals(yes);
                            }
                            else if (opt == 2) {

                                boolean conti = true;
                                do {
                                    System.out.println("\nStudent Login\n");
                                    System.out.print("Enter student id: ");
                                    String id = sc.next();
                    
                                    System.out.print("\nEnter password: ");
                                    String password = sc.next();
                                
                                    // validation
                            
                                    Iterator<Voter> iterator = voter.getVoterList().getIterator();
                            
                                    boolean loggedIn = false;
                                    while (iterator.hasNext()) {
                                
                                        Voter voterIt = iterator.next();
                                        if (voterIt.getId().equals(id) && voterIt.getPassword().equals(password)) {
                                            System.out.print("\nLogin Successfully\n");
                                            loggedIn = true;
                                            conti = false;

                                            /*
                                            
                                            ======= Voting Module =======

                                            */
                                            
                                            // Vote for teacher of choice
                                    
                                            System.out.println("\n");
                                            System.out.println("======================================\n");
                                            System.out.println("Please Vote For Your Teacher of Choice\n");
                                    
                                    
                                            // 1. Display list of teachers
                                    
                                            // Create Iterator (first iterate) - Iterate through arrayQueue to access each data pair (name-voteCount)
                                            Iterator<VoteResultDataPair> nameIterator = voteResults.getIterator();
                                            VoteResultDataPair currentCandidate; // current selected object (VoteResultDataPair) stored inside voteResult
                                            
                                            // traverse through each entry, get name
                                            while (nameIterator.hasNext()) { // check if arrayQueue has any more elements - traverse through each dataPair in voteResults arrayQueue
                                                currentCandidate = nameIterator.next(); // access each arrayQueue entry (each entry stored in arrayQueue is an object - VoteResultDataPair)
                                                System.out.println(nameIterator.hashCode() + ". " + currentCandidate.getCandidateName());
                                            }
                                    
                                            // 2. Get input vote
                                            System.out.println("");
                                            System.out.print("Enter The Teacher Number: ");
                                            int inputSelectedCandidate = sc.nextInt(); // get index number input of name
                                    
                                            // 3. Update/Store Vote Count to corresponding teacher
                                    
                                            // Create Iterator (second iterate) - Iterate through arrayQueue to access each data pair (name-voteCount)
                                            Iterator<VoteResultDataPair> voteIterator = voteResults.getIterator();
                                            VoteResultDataPair selectedCandidate; // current selected object (VoteResultDataPair) stored inside voteResult
                                    
                                            // locate candidate by entry index in array queue, update vote count
                                            while (voteIterator.hasNext()) { // check if arrayQueue has any more elements - traverse through each dataPair in voteResults arrayQueue
                                                selectedCandidate = voteIterator.next(); // access each arrayQueue entry (each entry stored in arrayQueue is an object - VoteResultDataPair)
                                                if (inputSelectedCandidate == voteIterator.hashCode()) { // if candidate entry found
                                                    int currentVoteCount = selectedCandidate.getVoteCount();
                                                    selectedCandidate.setVoteCount(currentVoteCount + 1); // update vote count
                                                }
                                            }           
                                            
                                            System.out.println("Thank you for your vote.");
                                            System.out.println("\n");

                                            cont = false; // return back to main menu

                                            break;
                                        }
                                    }
                                    if (!loggedIn) {
                                        System.out.print("\nStudent ID or Password is invalid\n");
                                        conti = true;
                                    }
                    
                                }while(conti);
                    
                            }

                    } while (cont);
                    break;
                           // System.out.println("Want to add more (y/n)? : ");
                           // repeat = sc.next();

                            //voter.displayArrayList();
                
                case 3:
                // Display updated vote count
                   Results results = new Results();
                   results.printResults(voteResults);
                break;

                case 4:
                System.out.println("Have a good day!");
                repeat = "n";
                break;
            }   
        }
    }                 
}
