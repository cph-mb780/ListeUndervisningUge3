import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListeTest {
Liste liste = new Liste();
    @org.junit.jupiter.api.Test
    void isEmpty() {
        assertEquals(true, liste.isEmpty());
        liste.insertFromHead("Viktor");
        assertEquals(false, liste.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void insertFromHead() {
    }

    @Test
    void printListFromHead() {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");

        assertEquals("321", liste.printFromHead());
    }

    @Test
    void printListFromTail() {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");

        assertEquals("123", liste.printFromTail());
    }

    @Test
    void removeFromHead() {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");
        liste.insertFromHead("4");
//Returns new head.
        assertEquals("3", liste.removeFromHead());
    }

    @Test
    void removeFromTail() {
        liste.insertFromHead("1");
        liste.insertFromHead("2");
        liste.insertFromHead("3");
        liste.insertFromHead("4");

//Returns new tail.
        assertEquals("2", liste.removeFromTail());
    }
}