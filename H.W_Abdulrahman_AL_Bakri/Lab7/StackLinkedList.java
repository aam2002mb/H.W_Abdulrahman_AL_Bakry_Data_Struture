package H.W.Lab7;

public class StackLinkedList<E> implements Stack<E> {
    SinglyLinkedList<E>list=new SinglyLinkedList<>();

    public void printListReverse(StackLinkedList<E>list){
        StackLinkedList<E>l=new StackLinkedList<>();

        while (!list.isEmpty()) {
            l.push(list.pop());
        }
        while (!l.isEmpty()){

            list.push(l.pop());
            System.out.print(list.top()+"  ");
        }
    }
    public void print(StackLinkedList<E>list){
        StackLinkedList<E>l=new StackLinkedList<>();

        while (!list.isEmpty()) {
            System.out.print(list.top()+"  ");
            l.push(list.pop());


        }
        while (!l.isEmpty()){

            list.push(l.pop());

        }
    }

    protected static int evalPostfix(String express)
    {
        StackLinkedList<Integer> st = new StackLinkedList<>() {

        };

        for(int i=0; i < express.length(); i++)
        {
            char ch = express.charAt(i);

            if(Character.isDigit(ch))
                st.push(ch - '0');


            else
            {
                int value1 = st.pop();
                int value2 = st.pop();

                switch(ch)
                {
                    case '+':
                        st.push(value2 + value1);
                        break;

                    case '-':
                        st.push(value2 - value1);
                        break;

                    case '*':
                        st.push(value2*value1);
                        break;
                    case '/':
                        st.push(value2/value1);
                        break;
                }
            }
        }
        System.out.println(st.top());
        return st.pop();   // result return
    }

    public StackLinkedList<E> recursive(StackLinkedList<E>list){
        print(list);
        list=new StackLinkedList<>();

        return list;
    }
    public  static<E> E popBottom(StackLinkedList<E>list){

        StackLinkedList<E>l=new StackLinkedList<>();
        Transfer(list,l);
        E bottom=l.pop();
        Transfer(l,list);
        return bottom;
    }
    public   E bottom() {

        StackLinkedList<E> l = new StackLinkedList<>();

        while (!isEmpty()) {
            l.push(pop());
        }
        E bottom =  l.top();
        while (!l.isEmpty()) {
            push( l.pop());
        }
        return bottom;
    }
    public  static <E>  void Transfer(StackLinkedList<E>l,StackLinkedList<E>l1){
        while (!l.isEmpty()) {
            l1.push(l.pop());
        }
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public void  push(E e) {
        list.addFirst(e);

    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}
