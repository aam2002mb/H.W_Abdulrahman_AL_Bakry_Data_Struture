package H.W.Lab8;

public class QueueArray<E> implements Queue<E> {
    private  int s=0;
    private int  f=0;
    static  final  int CAPACITY=10;
    E []data;
    public QueueArray(int cap) {
        data= (E[]) new Object[cap];
    }
    public QueueArray() {
        this(CAPACITY);
    }

    public void rotate(QueueArray<E> q){
        q.enqueue(q.dequeue());
    }
    public  void  print(QueueArray<E>q) {
        QueueArray<E> q1 = new QueueArray<>();
        while (!q.isEmpty()) {
            System.out.print(q.first() + "  ");
            q1.enqueue(q.dequeue());

        }
        while (!q1.isEmpty()) {
            q.enqueue(q1.dequeue());

        }

    }
    public QueueArray<E> clone(QueueArray<E>q){
        QueueArray<E>q1=new QueueArray<>(10);
        int ff=q.size();
        while (ff>0){
            q1.enqueue(q.first());
            rotate(q);
            ff--;
        }

        return q1;


    }
    @Override
    public boolean isEmpty() {
        return s==0;
    }

    @Override
    public int size() {
        return s;
    }

    @Override
    public E first() {
        if (isEmpty())return  null;
        return data[f];
    }

    @Override
    public void enqueue(E e) {
        if(size()==data.length)
            throw new IllegalStateException("Queue is full");
        int x=(f+s)%data.length;
        data[x]=e;
        s++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())return  null;
        E delete=data[f];
        data[f]=null;
        f=(f+1)%data.length;
        s--;
        return delete;
    }

    @Override
    public QueueLinkedList<E> append(QueueLinkedList<E> L, QueueLinkedList<E> M) {
        return null;
    }
}
