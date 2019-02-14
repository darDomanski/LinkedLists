package com.codecool.LinkedLists.DoublyLinkedList;

class DoublyLinkedNode<T> {
    private DoublyLinkedNode<T> previous;
    private T data;
    private DoublyLinkedNode<T> next;

    public DoublyLinkedNode(T data) {
        this.data = data;
    }

    public DoublyLinkedNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyLinkedNode<T> previous) {
        this.previous = previous;
//        previous.setNext(this);
    }

    public T getData() {
        return data;
    }

    public DoublyLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode<T> next) {
        this.next = next;
//        next.previous = this;
    }
}
