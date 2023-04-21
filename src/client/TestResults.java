package client;
import entity.*;
import adt.*;

public class TestResults {
    public static void main(String args[]) {
        Results results = new Results();
        QueueInterface<VoteResultDataPair> voteResults = new ArrayQueue<VoteResultDataPair>();
        
        voteResults.enqueue(new VoteResultDataPair("candidateA", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateB", 5));
        voteResults.enqueue(new VoteResultDataPair("candidateC", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateE", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateF", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateG", 5));
        voteResults.enqueue(new VoteResultDataPair("candidateH", 0));
        voteResults.enqueue(new VoteResultDataPair("candidateI", 3));
        voteResults.enqueue(new VoteResultDataPair("candidateJ", 0));

        results.printResults(voteResults);
    }
}
