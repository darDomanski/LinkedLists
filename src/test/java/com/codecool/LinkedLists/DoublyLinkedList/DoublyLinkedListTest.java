package com.codecool.LinkedLists.DoublyLinkedList;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DoublyLinkedListTest {

    @Test
    void testAddingObjectToEmptyList() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("cat");
        String listToString = doublyLinkedList.toString();

        String expected = " cat";

        assertEquals(expected, listToString);
    }

    @Test
    void testAddingNullToList() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> doublyLinkedList.add(null));
    }

    @Test
    void testAddingObjectToListContainingSomeElements() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();
        doublyLinkedList.add("dog");
        String listToString = doublyLinkedList.toString();

        String expected = " mam pap cat dog";

        assertEquals(expected, listToString);
    }


    @Test
    void testGettingObjectFromEmptyList() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> doublyLinkedList.get(0));
    }

    @Test
    void testGettingObjectWithNegativeIndex() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();

        assertThrows(IllegalArgumentException.class, () -> doublyLinkedList.get(-1));
    }

    @Test
    void testGettingObjectWithNotExistingIndex() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();

        assertThrows(IllegalArgumentException.class, () -> doublyLinkedList.get(100));
    }

    @Test
    void testGettingObjectFromBeginningOfList() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();
        String retrievedString = doublyLinkedList.get(0);

        String expected = "mam";

        assertEquals(expected, retrievedString);

    }

    @Test
    void testGettingObjectFromEndOfList() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();
        String retrievedString = doublyLinkedList.get(2);

        String expected = "cat";

        assertEquals(expected, retrievedString);

    }

    @Test
    void testInsertingToEmptyList() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.insert(0, "dog");
        String listToString = doublyLinkedList.toString();

        String expected = " dog";

        assertEquals(expected, listToString);
    }

    @Test
    void testInsertingNullToList() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> doublyLinkedList.insert(0, null));
    }

    @Test
    void testInsertingToListContainingObjects() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();
        doublyLinkedList.insert(0, "dog");
        String listToString = doublyLinkedList.toString();

        String expected = " dog mam pap cat";

        assertEquals(expected, listToString);
    }

    @Test
    void testInsertingToTheEndOfListContainingObjects() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();
        doublyLinkedList.insert(2, "dog");
        String listToString = doublyLinkedList.toString();

        String expected = " mam pap dog cat";

        assertEquals(expected, listToString);
    }

    @Test
    void testInsertingToNotExistingIndex() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();

        assertThrows(IllegalArgumentException.class, () -> doublyLinkedList.insert(100, "dog"));
    }

    @Test
    void testInsertingToNegativeIndex() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();

        assertThrows(IllegalArgumentException.class, () -> doublyLinkedList.insert(-1, "dog"));
    }

    @Test
    void testRemovingObjectFromBeginningOfList() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();
        doublyLinkedList.remove("mam");
        String listToString = doublyLinkedList.toString();

        String expected = " pap cat";

        assertEquals(expected, listToString);
    }

    @Test
    void testRemovingObjectFromTheEndOfList() {
        DoublyLinkedList<String> doublyLinkedList = createTestList();
        doublyLinkedList.remove("cat");
        String listToString = doublyLinkedList.toString();

        String expected = " mam pap";

        assertEquals(expected, listToString);
    }


    private DoublyLinkedList<String> createTestList() {
        DoublyLinkedList<String> testList = new DoublyLinkedList<>();
        testList.add("mam");
        testList.add("pap");
        testList.add("cat");
        return testList;
    }

}