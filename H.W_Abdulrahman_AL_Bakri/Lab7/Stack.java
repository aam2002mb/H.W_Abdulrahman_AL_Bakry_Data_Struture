package H.W.Lab7;

public  interface Stack<E> {
    int size();
    boolean isEmpty();
    E top();
    void push(E e);
    E pop();
}
