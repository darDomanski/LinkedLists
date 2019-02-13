package com.codecool.LinkedLists.SinglyLinkedList;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> last;
    private int length = 0;

    public void add(T data) {
        Node<T> current = head;
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
            last = head;

        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.getNext().setNext(newNode);
        }
        length++;
    }


}
