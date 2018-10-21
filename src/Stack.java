public class Stack<T> {
    private T arr[];
    private int maxSize = 10;
    private int size=0;

    public Stack(){
        arr = (T[]) new Object[maxSize];
    }

    public Stack(int Size){
        if(Size<0)
            Size = 10;
        maxSize = Size;
        arr = (T[]) new Object[maxSize];
    }

    public boolean isFull(){
        return size==maxSize;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(T e){
        if(isFull())
            return;
        arr[size++] = e;
    }

    public void pop(){
        if(isEmpty())
            return;
        size--;
    }

    public T top(){
        if(isEmpty())
            return null;
        return arr[size-1];
    }

    public static void main(String []args){
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(10);
        System.out.println(stack.top());
        stack.pop();
    }
}
