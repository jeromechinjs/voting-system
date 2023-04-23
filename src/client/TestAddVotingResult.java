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
        voteResults.enqueue(new VoteResultDataPair("candidateA", 2));
        voteResults.enqueue(new VoteResultDataPair("candidateB", 5));
        voteResults.enqueue(new VoteResultDataPair("candidateC", 1));
        voteResults.enqueue(new VoteResultDataPair("candidateE", 20));
        voteResults.enqueue(new VoteResultDataPair("candidateF", 30));
        voteResults.enqueue(new VoteResultDataPair("candidateG", 5));
        voteResults.enqueue(new VoteResultDataPair("candidateH", 110));
        voteResults.enqueue(new VoteResultDataPair("candidateI", 3));
        voteResults.enqueue(new VoteResultDataPair("candidateJ", 0));

    //get iterator
    Iterator<VoteResultDataPair> iterator = voteResults.getIterator();
    VoteResultDataPair currentCandidate;
    while (iterator.hasNext()) { // check if arrayQueue has any more elements - traverse through each dataPair in voteResults arrayQueue
        currentCandidate = iterator.next();
        System.out.println(currentCandidate.getCandidateName() + "");
        System.out.println(currentCandidate.getVoteCount() + "");
        
    }
}
            
        
        
}
