import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

    public void testAddAtHead() {
        LinkedList<Integer>list = new LinkedList<Integer>(10);
        list.addAtHead(1);
        list.addAtHead(2);
        list.addAtTail(4);
        assertTrue(list.get(0)==2);
        assertFalse(list.get(0) == 1);
    }

    public void testAddAtTail() {
        LinkedList<Integer>list = new LinkedList<Integer>();
        list.addAtTail(1);
        list.addAtTail(2);
        assertTrue(list.get(0)==1);
        assertTrue(list.get(list.getSize()-1) == 2);
    }

    public void testAddAtIndex() {
        LinkedList<Integer>list = new LinkedList<Integer>();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtIndex(1,77);
        assertTrue(list.get(1)==77);
        assertTrue(list.get(list.getSize()-1) == 2);
    }

    public void testDelete() {
        LinkedList<Integer>list = new LinkedList<Integer>();
        list.addAtTail(1);
        list.addAtTail(2);
        list.addAtIndex(1,77);
        list.delete(1);
        assertFalse(list.get(1)==77);
        assertTrue(list.get(list.getSize()-1) == 2);
    }
}