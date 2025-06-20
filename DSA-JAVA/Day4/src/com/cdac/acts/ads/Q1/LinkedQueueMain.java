package com.cdac.acts.ads.Q1;

public class LinkedQueueMain {
    public static void main(String[] args) {
        // Integer Queue
        LinkedQueue<Integer> intQueue = new LinkedQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println("Dequeued: " + intQueue.dequeue());
        System.out.println("Front item: " + intQueue.peek());
        System.out.println("Is queue empty? " + intQueue.isEmpty());
        System.out.println("Is queue full? " + intQueue.isFull());

        // String Queue
        LinkedQueue<String> strQueue = new LinkedQueue<>();
        strQueue.enqueue("Alice");
        strQueue.enqueue("Bob");
        strQueue.enqueue("Charlie");

        System.out.println("\nDequeued: " + strQueue.dequeue());
        System.out.println("Front item: " + strQueue.peek());
        System.out.println("Is queue empty? " + strQueue.isEmpty());
    }
}
