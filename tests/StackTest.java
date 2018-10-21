import junit.framework.TestCase;

public class StackTest extends TestCase {

    public void testPush() {
        Stack<Integer> stack  = new Stack<Integer>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertTrue(stack.top() == 3);
        stack.pop();
        stack.push(4);
        assertFalse(stack.top() == 3);
        assertTrue(stack.top() == 4);
    }

    public void testPop() {
        Stack<Integer> stack  = new Stack<Integer>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertTrue(stack.top() == 3);
        stack.pop();
        assertTrue(stack.top() == 2);
    }
}