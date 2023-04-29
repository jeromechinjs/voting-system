package adt;

import entity.VoteResultDataPair;
import entity.Voter;

/**
 *
 * @author Bryan Wong
 */
public interface StackInterface<T> {
    public int getNumberOfEntries();
    public T peek();
    public T pop();
    public void push(T newEntry);
    public boolean isEmpty();
    public boolean isFull();
    public void expand();
    public void clear();
    public StackInterface<VoteResultDataPair> sortAscending(StackInterface<Integer> intStack, StackInterface<String> strStack);
    // public StackInterface<VoteResultDataPair> sortDescending(StackInterface<Integer> intStack, StackInterface<String> strStack);
}