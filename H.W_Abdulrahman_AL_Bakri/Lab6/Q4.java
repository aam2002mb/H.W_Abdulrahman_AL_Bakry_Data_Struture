package H.W.Lab6;

public class Q4 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer>L=new DoublyLinkedList<>();
        DoublyLinkedList<Integer>M=new DoublyLinkedList<>();
        L.addFirst(1);
        L.addLast(2);
        L.addLast(3);
        L.addLast(4);
        L.addLast(5);
        System.out.print("list1: ");
        L.print();
        M.addFirst(6);
        M.addLast(7);
        M.addLast(8);
        M.addLast(9);
        M.addLast(10);
        System.out.print("list2: ");
        M.print();
        System.out.print("after margin list: ");
        L=L.margin(L,M);
        L.print();

    }

}
