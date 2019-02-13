package com.codecool.LinkedLists.SinglyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SinglyLinkedListTest {

    @Test
    void testAddingObjectToEmptyList() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();
        singlyLinkedList.add("cat");
        String listToString = singlyLinkedList.toString();

        String expected = " cat";

        assertEquals(expected, listToString);
    }

    @Test
    void testAddingNullToList() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.add(null));
    }

    @Test
    void testAddingObjectToListContainingSomeElements() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();
        singlyLinkedList.add("dog");
        String listToString = singlyLinkedList.toString();

        String expected = " mam pap cat dog";

        assertEquals(expected, listToString);
    }


    @Test
    void testGettingObjectFromEmptyList() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.get(0));
    }

    @Test
    void testGettingObjectWithNegativeIndex() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();

        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.get(-1));
    }

    @Test
    void testGettingObjectWithNotExistingIndex() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();

        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.get(100));
    }

    @Test
    void testGettingObjectFromBeginningOfList() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();
        String retrievedString = singlyLinkedList.get(0);

        String expected = "mam";

        assertEquals(expected, retrievedString);

    }

    @Test
    void testGettingObjectFromEndOfList() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();
        String retrievedString = singlyLinkedList.get(2);

        String expected = "cat";

        assertEquals(expected, retrievedString);

    }

    @Test
    void testInsertingToEmptyList() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.insert(0, "dog");
        String listToString = singlyLinkedList.toString();

        String expected = " dog";

        assertEquals(expected, listToString);
    }

    @Test
    void testInsertingNullToList() {
        SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<>();

        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.insert(0, null));
    }

    @Test
    void testInsertingToListContainingObjects() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();
        singlyLinkedList.insert(0, "dog");
        String listToString = singlyLinkedList.toString();

        String expected = " dog mam pap cat";

        assertEquals(expected, listToString);
    }

    @Test
    void testInsertingToTheEndOfListContainingObjects() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();
        singlyLinkedList.insert(3, "dog");
        String listToString = singlyLinkedList.toString();

        String expected = " mam pap cat dog";

        assertEquals(expected, listToString);
    }

    @Test
    void testInsertingToNotExistingIndex() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();

        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.insert(100, "dog"));
    }

    @Test
    void testInsertingToNegativeIndex() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();

        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.insert(-1, "dog"));
    }

    @Test
    void testRemovingObjectFromBeginningOfList() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();
        singlyLinkedList.remove("mam");
        String listToString = singlyLinkedList.toString();

        String expected = " pap cat";

        assertEquals(expected, listToString);
    }

    @Test
    void testRemovingObjectFromTheEndOfList() {
        SinglyLinkedList<String> singlyLinkedList = createTestList();
        singlyLinkedList.remove("cat");
        String listToString = singlyLinkedList.toString();

        String expected = " mam pap";

        assertEquals(expected, listToString);
    }


    private SinglyLinkedList<String> createTestList() {
        SinglyLinkedList<String> testList = new SinglyLinkedList<>();
        testList.add("mam");
        testList.add("pap");
        testList.add("cat");
        return testList;
    }
}