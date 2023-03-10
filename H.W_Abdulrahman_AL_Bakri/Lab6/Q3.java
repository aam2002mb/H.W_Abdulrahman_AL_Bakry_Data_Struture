package H.W.Lab6;

import H.W.Lab4.SinglyLinkedList;

public class Q3 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> l=new DoublyLinkedList<>();
        DoublyLinkedList<Integer> m=new DoublyLinkedList<>();
        l.addFirst(11);
        l.addLast(11);

        m.addFirst(11);
        m.addLast(11);


        if (l.equals(m))
            System.out.println("The list m and list m equals" );
        else
            System.out.println("The list l and list m not equals" );

        if (m.equals(l))
            System.out.println("The list m and list l equals" );
        else
            System.out.println("The list m and list l not equals" );
    }
}
