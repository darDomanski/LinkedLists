package com.codecool.LinkedLists.DoublyLinkedList;

public class DoublyLinkedList<T> {

    private DoublyLinkedNode<T> head;
    private int length;

    public void add(T data) {
        if (data == null) throw new IllegalArgumentException("Can't add null to list!");


        DoublyLinkedNode<T> current = head;
        DoublyLinkedNode<T> newDoublyLinkedNode = new DoublyLinkedNode<>(data);

        if (current == null) {
            head = newDoublyLinkedNode;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            newDoublyLinkedNode.setPrevious(current);
            current.setNext(newDoublyLinkedNode);
        }
        length++;

    }

    public void remove(T data) {
        DoublyLinkedNode<T> current = head;

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

    public void insert(int index, T data) {
        if (index < 0 || index > length) throw new IllegalArgumentException("Wrong index given!");
        if (data == null) throw new IllegalArgumentException("Can't insert null to list!");

        DoublyLinkedNode<T> current = head;
        DoublyLinkedNode<T> newDoublyLinkedNode = new DoublyLinkedNode<T>(data);
        int counter = 0;

        if (index == counter) {
            if (current != null) {
                newDoublyLinkedNode.setNext(current);
                head.setPrevious(newDoublyLinkedNode);
            }
            head = newDoublyLinkedNode;

        } else {

            while (counter != index) {
                current = current.getNext();
                counter++;
            }

            current.getPrevious().setNext(newDoublyLinkedNode);
            current.setPrevious(newDoublyLinkedNode);
            newDoublyLinkedNode.setNext(current);
        }

        length++;
    }

    public T get(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Wrong index given!");
        if (head == null) throw new IllegalArgumentException("Can't retrieve any data - list is empty!");

        DoublyLinkedNode<T> current = head;
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

    @Override
    public String toString() {
        String listToString = "";
        DoublyLinkedNode<T> current = head;

        while (current.getNext() != null) {
            listToString += " " + current.getData().toString();
            current = current.getNext();
        }
        listToString += " " + current.getData().toString();
        return listToString;
    }
}
