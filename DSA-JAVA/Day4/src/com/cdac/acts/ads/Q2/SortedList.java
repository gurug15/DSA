package com.cdac.acts.ads.Q2;

public interface SortedList<T extends Comparable<T>> {
    void delete(T element);
    void deleteAll(T element);
    boolean search(T element);
    void insertSorted(T element); // For inserting while maintaining sorted order
    void printList(); // Utility method to display list contents
}
