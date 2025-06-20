package com.cdac.acts.ads.Q2;

public class SortedSinglyList<T extends Comparable<T>> implements SortedList<T> {
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public void delete(T element) {
        if (head == null) return;

        if (head.data.equals(element)) {
            head = head.next;
            return;
        }

        Node<T> prev = null, current = head;
        while (current != null && current.data.compareTo(element) < 0) {
            prev = current;
            current = current.next;
        }

        if (current != null && current.data.equals(element)) {
            prev.next = current.next;
        }
    }

    @Override
    public void deleteAll(T element) {
        while (head != null && head.data.equals(element)) {
            head = head.next;
        }

        Node<T> prev = null, current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    @Override
    public boolean search(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            if (current.data.compareTo(element) > 0) {
                return false;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void insertSorted(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null || head.data.compareTo(element) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null && current.next.data.compareTo(element) < 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    @Override
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
