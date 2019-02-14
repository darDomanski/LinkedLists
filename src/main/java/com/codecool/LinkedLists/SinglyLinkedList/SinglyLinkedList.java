package com.codecool.LinkedLists.SinglyLinkedList;

public class SinglyLinkedList<T> {
    private SinglyLinkedNode<T> head;
    private int length = 0;

    public void add(T data) {
        if (data == null) throw new IllegalArgumentException("Can't add null to list!");
        SinglyLinkedNode<T> current = head;
        SinglyLinkedNode<T> newSinglyLinkedNode = new SinglyLinkedNode<T>(data);

        if (head == null) {
            head = newSinglyLinkedNode;

        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newSinglyLinkedNode);
        }
        length++;
    }

    public T get(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Wrong index given!");
        if (head == null) throw new IllegalArgumentException("Can't retrieve any data - list is empty!");

        SinglyLinkedNode<T> current = head;
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
        if (data == null) throw new IllegalArgumentException("Can't insert null to list!");

        SinglyLinkedNode<T> previous = null;
        SinglyLinkedNode<T> current = head;
        SinglyLinkedNode<T> newSinglyLinkedNode = new SinglyLinkedNode<T>(data);
        int counter = 0;

        if (index == 0) {

            newSinglyLinkedNode.setNext(current);
            head = newSinglyLinkedNode;

        } else {

            while (counter != index) {
                previous = current;
                current = current.getNext();
                counter++;
            }

            previous.setNext(newSinglyLinkedNode);
            newSinglyLinkedNode.setNext(current);
        }

        length++;
    }

    public void remove(T data) {
        SinglyLinkedNode<T> current = head;

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

    @Override
    public String toString() {
        String listToString = "";
        SinglyLinkedNode<T> current = head;

        while (current.getNext() != null) {
            listToString += " " + current.getData().toString();
            current = current.getNext();
        }
        listToString += " " + current.getData().toString();

        return listToString;
    }
}
