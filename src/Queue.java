//First in, First out
public class Queue<T> {
    private T arr[];
    private int maxSize = 10;
    private int size=0;

    public Queue(){
        arr = (T[]) new Object[maxSize];
    }

    public Queue(int Size){
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
        for(int i=0; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    public T top(){
        if(isEmpty())
            return null;
        return arr[0];
    }

    public static void main(String []args){
        Queue<Integer> stack = new Queue<Integer>(10);
        stack.push(10);
        System.out.println(stack.top());
        stack.pop();
    }
}
