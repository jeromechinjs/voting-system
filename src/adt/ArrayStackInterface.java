package adt;
/**
 *
 * @author Bryan Wong
 */
public interface ArrayStackInterface<T> {
    public T peek();
    public T pop();
    public void push(T newEntry);
    public boolean isEmpty();
    public boolean isFull();
    public void expand();
    public void sortAscending();
    public void sortDescending();
    public void clear();
}
