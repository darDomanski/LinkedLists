package com.codecool.LinkedLists.DoublyLinkedList;

public class Node<T> {
    private Node<T> previous;
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
