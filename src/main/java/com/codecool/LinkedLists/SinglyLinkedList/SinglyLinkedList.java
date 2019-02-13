package com.codecool.LinkedLists.SinglyLinkedList;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private int length = 0;

    public void add(T data) {
        Node<T> current = head;
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;

        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        length++;
    }

    public T get(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Wrong index given!");

        Node<T> current = head;
        int counter = -1;

        while (counter != index) {
            counter++;

            if (counter == index) {
                break;
            } else {
                current = current.getNext();
            }
        }
        return current.getData();
    }

    public void insert(int index, T data) {
        if (index < 0 || index > length) throw new IllegalArgumentException("Wrong index given!");

        Node<T> previous = null;
        Node<T> current = head;
        Node<T> newNode = new Node<T>(data);
        int counter = 0;

        if (index == 0) {

            newNode.setNext(current);
            head = newNode;

        } else {

            while (counter != index) {
                previous = current;
                current = current.getNext();
                counter++;
            }

            previous.setNext(newNode);
            newNode.setNext(current);
        }

        length++;
    }

    public void remove(T data) {
        Node<T> current = head;

        if (current != null) {

            if (current.getData().equals(data)) {
                head = current.getNext();

            } else {
                while (current.getNext() != null) {

                    if (current.getNext().getData().equals(data)) {
                        current.setNext(current.getNext().getNext());
                    } else {
                        current = current.getNext();
                    }
                }
            }
            length--;
        }
    }
}
