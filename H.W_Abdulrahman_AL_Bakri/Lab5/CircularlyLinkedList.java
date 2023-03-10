package H.W.Lab5;

import H.W.Lab4.SinglyLinkedList;

public class CircularlyLinkedList<E> {
    private Node<E>tail=null;
    private  int size=0;

    public CircularlyLinkedList() {

    }
    public int size(CircularlyLinkedList<E> list){
        Node<E>i=tail.next;
        int s=0;
        while (i!=null){
            s++;
            i=i.next;
            if( tail.next==i)
                break;
        }return  s;
    }
    public boolean  equals(CircularlyLinkedList<E> L,CircularlyLinkedList<E> M){
        boolean f=false;
        Node<E>m=M.tail.next;
        Node<E>l=L.tail.next;
        if (L.size()==M.size()){
            while (m!=null&&l!=null){
                if (m.element==l.element)
                    f=true;
                else {
                    f=false;
                    return  f;}
                m=m.next;
                l=l.next;
                if( m==M.tail.next&&l==L.tail.next)
                    break;
            }}

        return  f;
    }
    public boolean  sameSequence(CircularlyLinkedList<E> L,CircularlyLinkedList<E> M){
        boolean f=false;
        Node<E>m=M.tail.next;
        Node<E>l=L.tail.next;
        if (L.size()==M.size()){
            for (int i = 1; i <=M.size ; i++) {

                if (m.element== l.element) {

                    break;

                }
                else {
                    m = m.next;
                    if (i == M.size )
                        return f;
                }


            }
            while (m!=null&&l!=null){
                if (m.element==l.element)
                    f=true;
                else {
                    f=false;
                    return  f;}
                m=m.next;
                l=l.next;
                if(l==L.tail.next)
                    break;
            }
        }

        return  f;
    }
    public CircularlyLinkedList<E> split(CircularlyLinkedList<E>l){
        CircularlyLinkedList<E>l2=new CircularlyLinkedList<>();
        if (l.size%2==0){
            for (int i=0;i<=l.size/2;i++){
                l2.addLast(  l.removeFirst());
            }
        }return l2;}
    public CircularlyLinkedList<E> clone(CircularlyLinkedList<E>l){
        CircularlyLinkedList<E>l1=new CircularlyLinkedList<>();
        Node<E> i=l.tail.next;
        while (i!=l.tail){

            l1.addLast(i.element);
            i=i.next;
        }   l1.addLast(i.element);
        return l1;}

    public  boolean isEmpty(){
        return  size==0;
    }
    public  int size()
    {return size;}
    public E first()
    {
        if( isEmpty())return  null;
        return tail.next.getElement();
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tail.element;
    }

    public void addFirst(E newElment)
    {if (size==0)
    {   tail=new Node<E>(newElment,null);
        tail.setNext(tail);}
    else {
        tail.next=new Node<>(newElment,tail.next);
        tail.setNext(tail.next);
    }

        size++;

    }
    public  void addLast(E newelement){
        addFirst(newelement);
        tail=tail.next;
    }
    public E removeFirst(){
        if (isEmpty())return  null;
        E x =tail.getElement();
        tail=tail.getNext();
        size--;
        if ((size==0))
            tail=null;
        return  x;

    }
    public void rotate(){
        if(tail!=null){
            tail=tail.next;
        }
    }
    public void print(){
        Node<E> i=tail.next;
        while (i!=tail){
            System.out.print(i.getElement()+"  ");
            i=i.next;
        }

        System.out.println(i.getElement());
    }
    public CircularlyLinkedList<E> margin(CircularlyLinkedList<E> L, CircularlyLinkedList<E> M) {
        L.size = L.size + M.size;
        L.tail.next = M.tail.next;
        L.tail = M.tail;
        return L;
    }

    private static  class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}