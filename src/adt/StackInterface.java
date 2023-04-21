package adt;
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
}
