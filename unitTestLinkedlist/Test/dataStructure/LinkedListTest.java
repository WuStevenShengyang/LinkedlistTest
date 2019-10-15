package dataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class LinkedListTest {
    LinkedList list;

    @Before
    public void setup() {
        list = new LinkedList();
    }

    @Test
    public void testPush() {
        list.push("A");
        list.push("B");
        assertEquals(2, list.size());
        assertEquals("B", list.get(0));

    }
    
    @Test
    public void testPush2() {
        list.push("A");
        list.push("B");
        assertEquals(2, list.size());
    }
    
    @Test
    public void testRemove() {
        list.remove(1);
        assertEquals("A", list.get(0));
    }
}
