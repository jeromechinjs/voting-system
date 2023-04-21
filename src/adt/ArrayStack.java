package adt;
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
    public void clear() {
        topIndex = -1;
    }
    
    
}
