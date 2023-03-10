package H.W.Lab8;

public class Q2 {
    public static void main(String[] args) {
        QueueLinkedList<Integer>L=new QueueLinkedList<>();
        QueueLinkedList<Integer>M=new QueueLinkedList<>();
        L.enqueue(1);
        L.enqueue(2);
        L.enqueue(3);
        M.enqueue(4);
        M.enqueue(5);
        M.enqueue(6);
        M.enqueue(7);
        M.enqueue(8);
        M.enqueue(9);
        M.enqueue(10);
        L=L.append(L,M);
        L.print();

    }
}
