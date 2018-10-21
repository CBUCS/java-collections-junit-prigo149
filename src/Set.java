import java.util.Arrays;

public class Set<T> {
    private T arr[];
    private int size;
    private int maxSize=10; //by default

    public Set(){
        arr = (T[])new Object[maxSize];
    }
    public Set(int Size){
        if(Size<=0){
            Size = 10;
        }
        arr = (T[])new Object[Size];
        maxSize = Size;
        size = 0;
    }

    public boolean isFull(){
        return size==maxSize;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }

    public T get(int i)
    {
        if(i<0 || i>=maxSize)
            throw new IndexOutOfBoundsException("Error");
        return arr[i];
    }

    public void add(T element) {
        if(contains(element))
            return;
        if (!isFull())
            arr[size++] = element;
    }

    public void clear(){
        size = 0;
    }

    public boolean contains(T element){
        for(int i=0; i<size; i++){
            if(element.equals(arr[i])){
                return true;
            }
        }
        return false;
    }

    public boolean remove(int index){
        if(index<0 || index >= size)
            throw new IndexOutOfBoundsException();
        for(int i=index; i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
        return true;
    }

    public void print(){
        for(int i=0; i<size;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String []args){
        Set<Integer> set = new Set<Integer>(10);
        set.add(10);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.remove(2);
        set.print();
    }
}