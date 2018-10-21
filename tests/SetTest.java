import junit.framework.TestCase;


public class SetTest extends TestCase {

    public void testAdd() {
        Set<Integer>set = new Set<Integer>(10);
        set.add(10);
        assertTrue(set.contains(10));
    }

    public void testClear() {
        Set<Integer>set = new Set<Integer>(10);
        set.add(10);
        assertTrue(set.getSize()>0);
        set.clear();
        assertTrue(set.getSize()==0);
    }

    public void testContains() {
        Set<Integer>set = new Set<Integer>(10);
        set.add(10);
        assertTrue(set.contains(10));
        assertFalse(set.contains(20));
        //add mulitple times
        set.add(10);
        set.add(10);
        set.remove(0);
        assertFalse(set.contains(10));
    }

    public void testRemove() {
        Set<Integer>set = new Set<Integer>(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.remove(0);
        assertFalse(set.contains(10));
        assertTrue(set.contains(20));
        set.remove(0);
        assertFalse(set.contains(20));
    }
}