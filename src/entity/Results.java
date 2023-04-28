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
        StackInterface<Integer> voteStack = new ArrayStack<>();
        StackInterface<String> nameStack = new ArrayStack<>();
        StackInterface<VoteResultDataPair> sortedStack = new ArrayStack<>();

        Iterator<VoteResultDataPair> resultIterator = voteResults.getIterator();
        VoteResultDataPair result; 
        
        while (resultIterator.hasNext()) {
            result = resultIterator.next(); 
            nameStack.push(result.getCandidateName());
            voteStack.push(result.getVoteCount());
        }
        
        sortedStack = sortedStack.sortAscending(voteStack, nameStack);
        voteStack.clear();
        nameStack.clear();

        System.out.printf("Thank you for your paticipation in the voting of Teacher of The Year!\n" +
                           "Below are the results for The Teacher of The Year:\n");
        System.out.printf("\n%-4s %-15s %-15s\n", "No.", "Teacher", "Vote Count");
        for (int i = 0; i < (sortedStack.getNumberOfEntries()); i++) {
            System.out.printf("%-4d %-15s %-2d\n", i+1, sortedStack.peek().getCandidateName(), sortedStack.peek().getVoteCount());
            sortedStack.pop();
        }

    }

   

}
