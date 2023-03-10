package H.W.Lab6;

public class DoublyLinkedList2<E> {
    private Node<E> head;
    private Node<E> tail;
    private  int size=0;

    public DoublyLinkedList2() {
        head=new Node<>(null,null, null);
        tail= new Node<>(null,head, null);
        head.next=tail;
    }

    public  boolean isEmpty(){
        return size==0;
    }
    public  int size()
    {return size;}
    public E first()
    {
        if( isEmpty())return  null;
        return head.element;
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tail.prev.element;
    }
    private  void  addBetween (E e, Node<E> p, Node<E> n){
        Node<E> x=new Node<>(e,p,n);
        p.next=x;
        n.prev=x;
        size++;

    }
    public void addFirst(E e)
    {
        head=new Node<E>(e,null,head);
        if (isEmpty())
            tail.prev=head;
        size++;

    }
    public void addLast(E e)
    {
        Node<E>newest=new Node<E>(e,null,null);
        if (isEmpty())
        {
            head=newest;
            newest.next=tail;
        }
        else {
            tail.prev.next=newest;
            tail.prev=newest;
            }
        size++;
    }

    private E remove(Node<E> x)  {
        if( isEmpty())return  null;
        if (size>1)
        {
            tail.prev=x.prev;
            x.prev=x.next;
        }
        else
            head=null;

        size--;
        return x.element;

    }

    public void print(){
        Node<E> i=head;
        while (i!=null){
            System.out.print(i.getElement()+"  ");
            i=i.next;
        }
        System.out.println();
    }


    public  E removeFirst()

    {
        if(isEmpty())return  null;
        E del=head.element;
        if (size>1)
            head=new Node<>(head.next.element,null,head.next.next);
        else

            head=null;
        size--;
        if (size==0)
            tail.prev=null;
        return  del;
    }

    public  E removeLast()

    {
        if(isEmpty())return  null;
        E del=tail.prev.element;
        if (size>1)
        {
            tail.prev.prev.next=tail;
            tail.prev=tail.prev.prev;
        }
        else
        {
         head=null;
         tail.prev=null;
        }
        size--;

        return  del;
    }

    protected   static class Node<E>{
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
