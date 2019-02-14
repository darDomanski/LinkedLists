package com.codecool.LinkedLists.SinglyLinkedList;

class SinglyLinkedNode<T> {
    private SinglyLinkedNode<T> next;
    private T data;

    public SinglyLinkedNode(T data) {
        this.data = data;
    }

    public SinglyLinkedNode<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(SinglyLinkedNode<T> next) {
        this.next = next;
    }
}