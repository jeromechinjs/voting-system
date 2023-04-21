package adt;

import java.util.Iterator;

/**
   QueueInterface.java An interface for the ADT queue with an additional method that returns an iterator to the queue.

   @author Jia Shen
 */


public interface QueueInterface<T> {

  public Iterator<T> getIterator();

  /**
   Add a new entry to the back of the queue. * * @param newEntry an object to be added
   */
  public void enqueue(T newEntry);

  /**
Removes and returns the entry at the front of the queue. @return either the object at the front of the queue or, if the queue is *
empty before the operation, null
   */
  public T dequeue();

  /**
   Retrieves the entry at the front of the queue. * * @return either the object at the front of the queue or, if the queue is * empty, null */
  public T getFront();

  /**
   Detects whether the queue is empty. * * @return true if the queue is empty, or false otherwise*/
  public boolean isEmpty();

  /**
   Removes all entries from the queue.
   */
  public void clear();
}
