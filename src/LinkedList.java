public class LinkedList<T> {
    class Node<T> {
        private T element = null;
        private Node<T> next = null;

        Node(T e){
            element = e;
        }
        Node(T e, Node<T>node){
            element = e;
            next = node;
        }
    }

    Node<T>head;
    Node<T>tail;
    int size = 0;
    public LinkedList(){
        head = tail = null;
    }

    public LinkedList(T e){
        head = tail = new Node<T>(e);
        size++;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void addAtHead(T e){
        if(!isEmpty()) {
            head = tail = new Node<T>(e);
            size++;
            return;
        }
        Node<T> temp = head;
        head = tail = new Node<T>(e,temp);
        size++;
    }

    public void addAtTail(T e){
        if(isEmpty())
        {
            addAtHead(e);
            return;
        }
        tail.next = new Node<T>(e);
        tail = tail.next;
        size++;
    }

    public void addAtIndex(int index, T e){
        if(index<0 || index>size)
            return;
        if(index == 0 )
            addAtHead(e);
        else if(index == size){
            addAtTail(e);
        }
        else{
            Node<T>temp = head;
            for(int i=0; i<index-1; i++)
                temp = temp.next;

            Node<T>toInsert = new Node<T>(e,temp.next);
            temp.next = toInsert;
            size++;
        }
    }

    public void delete(int index) {
        if(index<0 || index>=size)
            return;
        Node<T> temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        if(temp.next != null)
            temp.next = temp.next.next;
        else
            temp.next = null;
        size--;
    }

    public void print(){
        if(isEmpty())
            return;
        Node<T>temp = head;
        do{
            System.out.println(temp.element);
            temp= temp.next;
        }while(temp!=null);
    }

    public T get(int index){
        if(index<0 || index >= size)
            return null;
        Node<T>temp = head;
        for(int i=0 ; i<index; i++){
            temp = temp.next;
        }
        return temp.element;
    }

    public int getSize(){
        return size;
    }

    public static void main(String []args){
        LinkedList<Integer> ll = new LinkedList<Integer>(10);
        ll.addAtHead(11);
        ll.addAtHead(12);
        ll.addAtHead(13);
        ll.addAtTail(8);
        ll.addAtTail(7);
        ll.addAtIndex(4,4);
        ll.print();
        ll.addAtIndex(4,9);
        ll.delete(4);
        ll.print();
    }
}
