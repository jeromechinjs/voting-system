package client;
import adt.*;
import entity.*;

import java.util.Scanner;
import java.util.Iterator;

public class TestAddVotingResult {
    public static void main(String args[]) {
        
        QueueInterface<VoteResultDataPair> voteResults = new ArrayQueue<VoteResultDataPair>();
        
        Scanner sc = new Scanner(System.in); 

        // sample data
        voteResults.enqueue(new VoteResultDataPair("candidate1", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate2", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate3", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate4", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate5", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate6", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate7", 120));
        voteResults.enqueue(new VoteResultDataPair("candidate8", 0));
        voteResults.enqueue(new VoteResultDataPair("candidate9", 0));

        // ----------TEST--------
        // Display Initital State
        // Create Iterator (first iterate) - Iterate through arrayQueue to access each data pair (name-voteCount)
        Iterator<VoteResultDataPair> displayResult = voteResults.getIterator();
        VoteResultDataPair candidate; // current selected object (VoteResultDataPair) stored inside voteResult
        
        // traverse through each entry, get name
        System.out.printf("%-10s %15s\n","Candidates", "Vote Count");
        while (displayResult.hasNext()) { // check if arrayQueue has any more elements - traverse through each dataPair in voteResults arrayQueue
            candidate = displayResult.next(); // access each arrayQueue entry (each entry stored in arrayQueue is an object - VoteResultDataPair)
            System.out.printf("%-10s - %10s\n", candidate.getCandidateName(), candidate.getVoteCount());
        }
        // ----------TEST--------









        // Vote for teacher of choice

        System.out.println("");
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
        System.out.print("Enter The Number Teacher Number: ");
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







        // ----------TEST--------
        // Display updated vote count
        System.out.println("\n");

        // Create Iterator (first iterate) - Iterate through arrayQueue to access each data pair (name-voteCount)
        Iterator<VoteResultDataPair> resultIterator = voteResults.getIterator();
        VoteResultDataPair result; // current selected object (VoteResultDataPair) stored inside voteResult
        
        // traverse through each entry, get name
        System.out.printf("%-10s %15s\n","Candidates", "Vote Count");
        while (resultIterator.hasNext()) { // check if arrayQueue has any more elements - traverse through each dataPair in voteResults arrayQueue
            result = resultIterator.next(); // access each arrayQueue entry (each entry stored in arrayQueue is an object - VoteResultDataPair)
            System.out.printf("%-10s - %10s\n", result.getCandidateName(), result.getVoteCount());
        }

}
            
        
        
}
