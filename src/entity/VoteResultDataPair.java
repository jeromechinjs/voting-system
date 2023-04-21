/**
   VoteResultDataPair.java collects teacher-voteCount as a pair to be stored inside arrayQueue 'voteResults'

   @author Jia Shen
 */

package entity;

public class VoteResultDataPair {
    private String candidateName;
    private int voteCount;

    // Constructor
    
    public VoteResultDataPair(String candidateName, int voteCount) {
        this.candidateName = candidateName;
        this.voteCount = voteCount;
    }
    
    // Getters and Setters
    
    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

}
