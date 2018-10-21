import junit.framework.TestCase;

public class HashMapTest extends TestCase {

    public void testPut() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("JD", 1);
        map.put("Priyesh", 3);
        map.put("Goswami", 2);

        assertEquals(1, map.get("JD"), 0);

        map.put("JD",4);
        assertEquals(4,map.get("JD"),0);

    }

    public void testRemove() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("JD", 1);
        map.put("Priyesh", 3);
        map.put("Yaseen", 2);

        assertEquals(1, map.get("JD"), 0);

        map.remove("Priyesh");
        assertEquals(null, map.get("Priyesh"));

        assertEquals(true, map.remove("JD"));
        assertEquals(false, map.remove("JD"));

        map.put("JD", 2);
        assertEquals(true, map.remove("JD"));
    }

    public void testGet() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("JD", 1);
        map.put("Priyesh", 3);
        map.put("Yaseen", 2);

        assertEquals(1, map.get("JD"), 0);
        assertTrue(1 == map.get("JD"));
        assertFalse(2 == map.get("JD"));
        assertTrue(3==map.get("Priyesh"));
    }
}