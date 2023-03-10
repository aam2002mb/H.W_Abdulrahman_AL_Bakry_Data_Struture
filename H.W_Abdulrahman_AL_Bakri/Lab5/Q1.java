package H.W.Lab5;

import H.W.Lab4.SinglyLinkedList;

public class Q1 {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> l = new CircularlyLinkedList<>();

        l.addFirst(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        System.out.println(l.size());;
    }
}

