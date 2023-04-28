package entity;

import java.util.Iterator;

import adt.*;

/**
 *
 * @author Bryan Wong
 */
public class Results {

    public Results(){}
    
    public void printResults(QueueInterface<VoteResultDataPair> voteResults) {
        StackInterface<VoteResultDataPair> resultsStack = new ArrayStack<>();

        while (!voteResults.isEmpty()) {
            resultsStack.push(voteResults.dequeue());
        }
        
        System.out.printf("Thank you for your paticipation in the voting of Teacher of The Year!\n" +
                           "Below are the results for The Teacher of The Year:\n");
        System.out.printf("%-4s %-15s %-15s\n", "No.", "Teacher", "Vote Count");
        for (int i = 0; i < (resultsStack.getNumberOfEntries()); i++) {
            System.out.printf("%-4d %-15s %-2d\n", i+1, resultsStack.pop().getCandidateName(), resultsStack.pop().getVoteCount());
        }
        System.out.printf("\n...And The Teacher of The Year is " + resultsStack.pop().getCandidateName() + "!!!!");

    }

   

}
