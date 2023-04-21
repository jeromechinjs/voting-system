package adt;

public interface CandidateList {
    CandidateList next = null;

    void addCandidate(CandidateList newCandidate);

    void removeCandidate(CandidateList candidateToRemove);

    public void displayCandidateList();
}
