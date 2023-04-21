package client;

import adt.ArrayQueue;
import adt.QueueInterface;
import entity.VoteResultDataPair;

import java.util.Scanner;
import java.util.Iterator;

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

    // get iterator
    Iterator<VoteResultDataPair> iterator = voteResults.getIterator();
        
    while (iterator.hasNext()) { // traverse through each dataPair in voteResults arrayQueue
        voteResults = iterator.next();
        
    }
            
        
        
}
