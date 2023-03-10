package H.W.Lab8;

public interface Queue<E> {
    int size();
    boolean isEmpty();
    E first();
    void enqueue(E e);
    E dequeue();

    QueueLinkedList<E> append(QueueLinkedList<E> L, QueueLinkedList<E> M);
}
