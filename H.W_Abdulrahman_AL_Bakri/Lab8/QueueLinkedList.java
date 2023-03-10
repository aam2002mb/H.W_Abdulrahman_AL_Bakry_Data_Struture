package H.W.Lab8;

public class QueueLinkedList<E> implements Queue<E> {
    SinglyLinkedList<E> list=new SinglyLinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {

        return list.first() ;

    }

    @Override
    public void enqueue(E e) {

        list.addLast(e);
    }

    @Override
    public E dequeue() {

        return   list.removeFirst();
    }
    public void rotate(){
        enqueue(dequeue());
    }
    public QueueLinkedList<E> append(QueueLinkedList<E> L, QueueLinkedList<E> M) {

        L.list.size+=M.list.size;
        L.list.tail.next=M.list.head;
        L.list.tail= M.list.tail;

        return L;
    }
    public void print(){
        SinglyLinkedList.Node<E> i=list.head;
        while (i!=null){
            System.out.println(i.getElement());
            i=i.next;
        }
    }
}
