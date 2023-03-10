package H.W.Lab6;

public class Q7 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> a =new DoublyLinkedList<>();
        DoublyLinkedList<Integer> b =new DoublyLinkedList<>();
        a.addFirst(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);
        a.addLast(6);
        a.addLast(7);
        a.addLast(8);
        a.addLast(9);

        System.out.print("list : ");
        a.print();

        b=b.clone(a);
        System.out.println("after clone:  ");
        System.out.print("list :  ");
        a.print();

        System.out.print("list2:  ");
        b.print();



    }
}
