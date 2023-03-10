package H.W.Lab5;

import H.W.Lab4.SinglyLinkedList;

public class Q3 {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> L=new CircularlyLinkedList<>();
        CircularlyLinkedList<Integer>M=new CircularlyLinkedList<>();
        L.addFirst(1);
        L.addLast(2);
        L.addLast(3);
        L.addLast(4);
        L.addLast(5);
        M.addLast(6);
        M.addLast(7);
        M.addLast(8);
        M.addLast(9);
        M.addLast(10);
        L=L.margin(L,M);
        while (!L.isEmpty()){
            System.out.print(L.removeFirst()+" , ");
        }

    }
}

