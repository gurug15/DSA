package com.cdac.acts.ads.Q1;

public interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    boolean isEmpty();
    boolean isFull();
    T peek();
}
