package H.W.Lab5;

public class Q4 {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer>L=new CircularlyLinkedList<>();
        CircularlyLinkedList<Integer>M=new CircularlyLinkedList<>();
        CircularlyLinkedList<Integer>K=new CircularlyLinkedList<>();
        L.addFirst(1);
        L.addLast(2);

        M.addFirst(2);
        M.addLast(1);

        K.addFirst(1);
        K.addLast(1);

        if (L.sameSequence(L,M))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list M and list L not equals" );

        if (K.sameSequence(L,K))
            System.out.println("list M and list L equals" );
        else
            System.out.println("list K and list L not equals" );
    }
}
