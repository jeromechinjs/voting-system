package client;

import java.util.Iterator;
import adt.ArrayQueue;
import adt.QueueInterface;
import entity.VoteResultDataPair;

// temporary list (for teacher names)
import adt.ArrayList;

import java.util.Scanner;

public class TestAddVotingResult {
    public static void main(String args[]) {
        
        ArrayQueue<VoteResultDataPair> voteResults = new ArrayQueue<VoteResultDataPair>();
        
        Scanner sc = new Scanner(System.in); 

        // temporary
        voteResults.enqueue(new VoteResultDataPair("candidateA", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateB", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateC", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateE", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateF", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateG", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateH", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateI", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateJ", 0));


        boolean cont = true;

         // get iterator
         Iterator<VoteResultDataPair> iterator = voteResults.iterator();
        
         while (iterator.hasNext()) { // traverse through each dataPair in voteResults arrayQueue
             voteResults = iterator.next();
             
 
             }
             
         }
            
        
        do {
             
            String registerId = sc.nextLine();
        
        
            System.out.print("Enter student name: ");
            String registerName = sc.nextLine();
        
            System.out.print("Enter student faculty: ");
            String faculty = sc.nextLine();
        
            System.out.print("Enter password: ");
            String registerPassword = sc.nextLine();
        
            Voter voter = new Voter(registerId, registerName, faculty, registerPassword);
        
            voterList.add(voter);
            
            System.out.print("Continue?: ");
            String yes = sc.nextLine();
            cont = "y".equals(yes);
            
        } while (cont);
       
        // displaying info in array list
//        for (int i = 1; i <= voterList.getNumberOfEntries(); i++) {
//            System.out.print("ID: " + voterList.getEntry(i).getId() + "\nName: " + voterList.getEntry(i).getName() + "\nFaculty: " + voterList.getEntry(i).getFaculty());
//            
//        }
        
        boolean conti = true;
        do {
            System.out.println("Student Login");
        System.out.print("Enter student id: ");
            String id = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();
            
      
    }
}
