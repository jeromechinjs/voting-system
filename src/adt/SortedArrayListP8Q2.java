
package adt;

/**
 * SortedArrayList - Implements the ADT Sorted List using an array. - Note: Some
 * methods are not implemented yet and have been left as practical exercises
 * @param <T>
 */
public class SortedArrayListP8Q2<T extends Comparable<T>> implements SortedListInterface<T> {

  private T[] array;
  private int numberOfEntries;
  private static final int DEFAULT_CAPACITY = 25;

  public SortedArrayListP8Q2() {
    this(DEFAULT_CAPACITY);
  }

  public SortedArrayListP8Q2(int initialCapacity) {
    numberOfEntries = 0;
    array = (T[]) new Comparable[initialCapacity];
  }

  private int binarySearch(T target) {
      int first = 0;
      int last = numberOfEntries - 1;
      while (first <= last) {
          int mid = (first + last) / 2;
          if(target.equals(array[mid])) {
              return mid; // send index
          } else if (target.compareTo(array[mid]) < 0) {
              last = mid - 1;
          } else {
              first = mid + 1;
          }
      }
      return -(last + 1); // because question states return value must be -ve
  }
  
  @Override
  public boolean add(T newEntry) {
    int i = Math.abs(binarySearch(newEntry)); // index must be +ve
//    while (i < numberOfEntries && newEntry.compareTo(array[i]) > 0) { // compareTo, returns An int value: 0 if the string is equal to the other string. < 0 if the string is lexicographically less than the other string, > 0 if the string is lexicographically greater than the other string (more characters)
//      i++;
//    }
    makeRoom(i + 1);
    array[i] = newEntry;
    numberOfEntries++;
    return true;
  }

  public boolean remove(T newEntry) {
    int i = Math.abs(binarySearch(newEntry)); // index must be +ve
//    while (i < numberOfEntries && newEntry.compareTo(array[i]) > 0) { // compareTo, returns An int value: 0 if the string is equal to the other string. < 0 if the string is lexicographically less than the other string, > 0 if the string is lexicographically greater than the other string (more characters)
//      i++;
//    }
    //makeRoom(i + 1);
    //array[i] = newEntry;
    //numberOfEntries++;
    return true;
  }

  public void clear() {
    numberOfEntries = 0;
  }

  public boolean contains(T anEntry) { // an entry is the element you want to found
    int index = binarySearch(anEntry);
    return (index >= 0 && anEntry.equals(array[index]));
  }

  public int getNumberOfEntries() {
    return numberOfEntries;
  }

  public boolean isEmpty() {
    return numberOfEntries == 0;
  }

  public String toString() {
    String outputStr = "";
    for (int index = 0; index < numberOfEntries; ++index) {
      outputStr += array[index] + "\n";
    }

    return outputStr;
  }

  private boolean isArrayFull() {
    return numberOfEntries == array.length;
  }

  private void doubleArray() {
    T[] oldList = array;
    int oldSize = oldList.length;

    array = (T[]) new Object[2 * oldSize];

    for (int index = 0; index < oldSize; index++) {
      array[index] = oldList[index];
    }
  }

  private void makeRoom(int newPosition) {
    int newIndex = newPosition - 1;
    int lastIndex = numberOfEntries - 1;

    for (int index = lastIndex; index >= newIndex; index--) {
      array[index + 1] = array[index];
    }
  }

  private void removeGap(int givenPosition) {
    int removedIndex = givenPosition - 1;
    int lastIndex = numberOfEntries - 1;

    for (int index = removedIndex; index < lastIndex; index++) {
      array[index] = array[index + 1];
    }
  }

  @Override
  public boolean isFull() {
    return false;
  }

}

