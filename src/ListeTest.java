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
}