import junit.framework.TestCase;

public class QueueTest extends TestCase {

    public void testPush() {
        Queue<Integer> queue  = new Queue<Integer>(10);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        assertTrue(queue.top() == 1);
        queue.pop();
        assertTrue(queue.top() == 2);
    }

    public void testPop() {
        Queue<Integer> queue  = new Queue<Integer>(10);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        assertTrue(queue.top() == 1);
        queue.pop();
        queue.pop();
        assertFalse(queue.top() == 2);
        assertTrue(queue.top() == 3);
    }
}