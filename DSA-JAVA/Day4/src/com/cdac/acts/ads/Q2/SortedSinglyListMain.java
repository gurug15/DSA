package com.cdac.acts.ads.Q2;

public class SortedSinglyListMain {
    public static void main(String[] args) {
        SortedSinglyList<Integer> sortedList = new SortedSinglyList<>();

        sortedList.insertSorted(10);
        sortedList.insertSorted(20);
        sortedList.insertSorted(30);
        sortedList.insertSorted(20); //taking a duplicate element

        System.out.println("Initial List:");
        sortedList.printList();

        sortedList.delete(20);
        System.out.println("After deleting first occurrence of 20:");
        sortedList.printList();

        sortedList.deleteAll(20);
        System.out.println("After deleting all occurrences of 20:");
        sortedList.printList();

        System.out.println("Search 10: " + sortedList.search(10)); //should return true
        System.out.println("Search 50: " + sortedList.search(50)); //should return false

        //testing with strings
        SortedSinglyList<String> stringList = new SortedSinglyList<>();
        stringList.insertSorted("Aditya");
        stringList.insertSorted("Atul");
        stringList.insertSorted("Mahesh");
        stringList.insertSorted("Guru");

        System.out.println("\nString List:");
        stringList.printList();

        stringList.deleteAll("Mahesh");
        System.out.println("After deleting all occurrences of 'Mahesh':");
        stringList.printList();
    }
}
