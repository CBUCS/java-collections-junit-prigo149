
import junit.framework.TestCase;
import org.junit.Test;

public class ArrayListTest extends TestCase {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        assertTrue(list.contains(3));
    }

    public void testAdd() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        assertTrue(list.getSize()==5);
    }

    public void testEnsureCapacity() {
        ArrayList<Integer> list = new ArrayList<Integer>(3);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(9);
        list.ensureCapacity(5);
        list.add(4);
        list.add(5);
    }

    public void testContains() {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.contains(1));
        assertTrue(list.contains(3));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>(1);
        list.add(10);
        list.remove(0);
        assertFalse(list.contains(10));
    }
}