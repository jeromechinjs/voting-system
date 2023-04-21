package adt;

import java.util.Comparator;
/**
 *
 * @author Bryan Wong
 */
public class ArrayStack<T> implements StackInterface<T> {

    private T[] arrayStack;
    private int topIndex, // index of top entry
                numberOfEntries; 
    private static final int DEFAULT_CAPACITY = 50;
    
    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int initialCapacity) {
        arrayStack = (T[]) new Object[initialCapacity];
        topIndex = -1;
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
    public StackInterface<Integer> sortAscending(StackInterface<Integer> aStack) {
        StackInterface<Integer> tempStack = new ArrayStack<>();      //temporary stack for sorting

        while (!aStack.isEmpty()) {         //Sort until aStack is empty
            int temp = aStack.pop();        

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {   //if tempStack is not empty AND tempStack's top element is larger than aStack's top element,
                aStack.push(tempStack.pop());                           //push tempStack's top element into aStack
            }
            tempStack.push(temp);
        }
        return tempStack;       //Sorted Stack
    }

    @Override
    public StackInterface<Integer> sortDescending(StackInterface<Integer> aStack) {
        StackInterface<Integer> tempStack = new ArrayStack<>();      //temporary stack for sorting

        aStack = aStack.sortAscending(aStack);      //Sorts stack in ascending order
        while (!aStack.isEmpty()) {
            tempStack.push(aStack.pop());           //Reverse order
        }
        return tempStack;       //Sorted Stack
    }

    @Override
    public void clear() {
        topIndex = -1;
    }
    
    
}
