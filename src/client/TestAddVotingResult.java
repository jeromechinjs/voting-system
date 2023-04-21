package client;
import adt.*;
import entity.*;

import java.util.Scanner;
import java.util.Iterator;

public class TestAddVotingResult {
    public static void main(String args[]) {
        
        QueueInterface<VoteResultDataPair> voteResults = new ArrayQueue<VoteResultDataPair>();
        
        Scanner sc = new Scanner(System.in); 

        // temporary
        voteResults.enqueue(new VoteResultDataPair("candidateA", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateB", 5));
        voteResults.enqueue(new VoteResultDataPair("candidateC", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateE", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateF", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateG", 5));
        voteResults.enqueue(new VoteResultDataPair("candidateH", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateI", 3));
        voteResults.enqueue(new VoteResultDataPair("candidateJ", 0));

    //get iterator
    Iterator<VoteResultDataPair> iterator = voteResults.getIterator();
    VoteResultDataPair a;
    while (iterator.hasNext()) { // check if arrayQueue has any more elements - traverse through each dataPair in voteResults arrayQueue
        iterator.next();
        System.out.print(voteResults.getFront().getVoteCount());
    }
}
            
        
        
}
