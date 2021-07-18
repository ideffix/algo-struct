package com.ideffix.struct;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class ListTest {

    private List<Integer> list = createEmptyList();

    abstract protected List<Integer> createEmptyList();

    @BeforeEach
    void setUp() {
        list = createEmptyList();
    }

    @Test
    void newListShouldBeEmpty() {
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void shouldNotBeEmptyAfterElementIsAdded() {
        list.add(1);
        assertFalse(list.isEmpty());
        assertEquals(1, list.size());
    }

    @Test
    void shouldBeEmptyAfterElementIsAddedAndRemoved() {
        list.add(1);
        list.remove(Integer.valueOf(1));
        assertFalse(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void shouldBeEmptyIfNonExistingElementIsRemoved() {
        list.remove(Integer.valueOf(1));
        assertFalse(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void shouldAddElements() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    void shouldAddNullElements() {
        list.add(1);
        list.add(null);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    void shouldGetElementsByIndex() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void shouldThrowExceptionWhenIndexAddIsNegative() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    void shouldThrowExceptionWhenAddIndexExceedingUpperBound() {
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    void shouldGetElementsByRef() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, list.get(Integer.valueOf(1)));
        assertEquals(2, list.get(Integer.valueOf(2)));
        assertEquals(3, list.get(Integer.valueOf(3)));
    }

    @Test
    void shouldInsertElementAtTheBeginning() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.insert(0, 0);
        assertEquals(0, list.get(0));
        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(3, list.get(3));
    }

    @Test
    void shouldInsertElementAtTheEnd() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.insert(4, 3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
    }

    @Test
    void shouldInsertElementInTheMiddle() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.insert(0, 1);
        assertEquals(1, list.get(0));
        assertEquals(0, list.get(1));
        assertEquals(2, list.get(2));
        assertEquals(3, list.get(3));
    }

    @Test
    void shouldThrowExceptionWhenInsertIndexIsNegative() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.insert(0, -1));
    }

    @Test
    void shouldThrowExceptionWhenInsertIndexExceedingUpperBound() {
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.insert(0, 2));
    }

    @Test
    void shouldRemoveElementFromTheBeginning() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        assertEquals(2, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void shouldRemoveElementFromTheEnd() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    void shouldRemoveElementFromTheMiddle() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void shouldThrowExceptionWhenRemoveIndexIsNegative() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    @Test
    void shouldThrowExceptionWhenRemoveIndexExceedingUpperBound() {
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    void shouldRemoveByRef() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(Integer.valueOf(1));
        assertEquals(2, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void shouldRemoveOnlyFirstOccurrenceByRef() {
        list.add(1);
        list.add(1);
        list.add(3);
        list.remove(Integer.valueOf(1));
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void shouldReturnFalseIfElementWasNotFoundWhenRemoving() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertFalse(list.remove(Integer.valueOf(4)));
    }

    @Test
    void shouldReturnTrueIfElementIsInArray() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.contains(2));
    }

    @Test
    void shouldReturnFalseIfElementIsNotInArray() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertFalse(list.contains(4));
    }

}
