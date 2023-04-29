package adt;

import entity.VoteResultDataPair;
import entity.Voter;

/**
 *
 * @author Bryan Wong
 */
public class ArrayStack<T> implements StackInterface<T> {

    private T[] arrayStack;
    private int topIndex, // index of top entry
                numberOfEntries; 
    private static final int DEFAULT_CAPACITY = 50;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int initialCapacity) {
        arrayStack = (T[]) new Object[initialCapacity];
        topIndex = -1;
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    @Override
    public T peek() {
        T top = null;
        if (!isEmpty()) {
            top = arrayStack[topIndex];
        }
        return top;
    }

    @Override
    public T pop() {
        T top = null;
        if (!isEmpty()) {
            top = arrayStack[topIndex];
            arrayStack[topIndex] = null;
            topIndex--;  
        } 
        return top;
    }

    @Override
    public void push(T newEntry) {
        topIndex++;

         if (topIndex < arrayStack.length) {
            arrayStack[topIndex] = newEntry;
        }
        numberOfEntries++;
    }

    @Override
    public boolean isEmpty() {
        return topIndex < 0;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == arrayStack.length;
    }

    @Override
    public void expand() {
        T[] oldArray = arrayStack;
        arrayStack = (T[]) new Object[2 * oldArray.length];
      
        for (int i = 0; i < numberOfEntries; i++) {
            arrayStack [i] = oldArray[i];
        }
    }

    @Override
    public StackInterface<VoteResultDataPair> sortAscending(StackInterface<Integer> intStack, StackInterface<String> strStack) {
        StackInterface<Integer> tempStack = new ArrayStack<>();      //temporary stack for sorting
        StackInterface<String> tempStackStr = new ArrayStack<>();
        StackInterface<VoteResultDataPair> sortedStack = new ArrayStack<>();

        while (!intStack.isEmpty()) {         //Sort until intStack is empty
            int temp = intStack.pop();   
            String strTemp = strStack.pop();     

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {   //if tempStack is not empty AND tempStack's top element is larger than intStack's top element,
                intStack.push(tempStack.pop());
                strStack.push(tempStackStr.pop());                           //push tempStack's top element into intStack
            }
            tempStack.push(temp);
            tempStackStr.push(strTemp);
        }

        while(!tempStack.isEmpty() && !tempStackStr.isEmpty()) {
            VoteResultDataPair temp;
            temp = new VoteResultDataPair(tempStackStr.pop(),tempStack.pop());
            sortedStack.push(temp);
        }
        return sortedStack;       //Sorted Stack
    }

    @Override
    public StackInterface<VoteResultDataPair> sortDescending(StackInterface<Integer> intStack, StackInterface<String> strStack) {
        StackInterface<VoteResultDataPair> tempStack = new ArrayStack<>();      //temporary stack for sorting
        StackInterface<VoteResultDataPair> sortedStack = new ArrayStack<>();

        sortedStack = sortedStack.sortAscending(intStack, strStack);      //Sorts stack in ascending order
        while (!sortedStack.isEmpty()) {
            tempStack.push(sortedStack.pop());           //Reverse order
        }
        return tempStack;       //Sorted Stack
    }

    @Override
    public void clear() {
        topIndex = -1;
    }
    
    
}
