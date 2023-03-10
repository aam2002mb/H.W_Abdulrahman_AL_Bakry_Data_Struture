package H.W.Lab7;

public class StackArray<E> implements Stack<E> {
    static final int Capcity=10;

    int t=-1;
    E data[];
    public E topSecond(){

        E top=pop();
        E topSec=top();
        push(top);
        return topSec;
    }
    public E popSecond(){

        E top=pop();
        E topSec=pop();
        push(top);
        return topSec;
    }
    public  StackArray<E> clone(StackArray<E>stack){
        StackArray<E>l1=new StackArray<>();
        while (stack.t>=0){
            l1.push(stack.top());
            stack.t--;
        }
        stack.t=l1.size()-1;
        l1.reverse(l1);
        return l1;

    }
    public void print(StackArray<E>list){
        StackArray<E>l=new StackArray<>();

        while (!list.isEmpty()) {
            System.out.print(list.top()+"  ");
            l.push(list.pop());

        }
        while (!l.isEmpty()){

            list.push(l.pop());

        }
    }
    public  static<E> void reverse(StackArray<E>stack){
        StackArray<E>l1=new StackArray<>();
        StackArray<E>l=new StackArray<>();
        Transfer(stack,l);
        Transfer(l,l1);
        Transfer(l1,stack);

    }
    public   E bottom() {

        StackArray l = new StackArray();

        while (!isEmpty()) {
            l.push(pop());
        }
        E bottom = (E) l.top();
        while (!l.isEmpty()) {
            push((E) l.pop());
        }
        return bottom;
    }
    public   E popBottom() {

        StackArray<E> l = new StackArray<>();
        while (!isEmpty()) {
            l.push(pop());
        }
        E bottom =  l.pop();
        while (!l.isEmpty()) {
            push( l.pop());
        }
        return bottom;
    }
    public  static <E>  void Transfer(StackArray<E>l,StackArray<E>l1){
        while (!l.isEmpty()) {
            l1.push(l.pop());
        }
    }
    public StackArray(int c){
        data= (E[]) new  Object[c] ;
    }
    public StackArray(){
        this(Capcity);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E top() {
        if (isEmpty())
            return null;
        return  data[t];
    }

    @Override
    public void push(E e) {
        if (size() == data.length)
            throw new IllegalStateException("Stack is full");
        data[++t]=e;


    }

    @Override
    public E pop() {
        if(isEmpty())
            return null;
        E del=data[t];
        data[t]=null;
        t--;
        return del;
    }
}
