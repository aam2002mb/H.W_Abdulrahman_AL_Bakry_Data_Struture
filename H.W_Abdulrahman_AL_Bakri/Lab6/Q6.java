package H.W.Lab6;

public class Q6 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer>list=new DoublyLinkedList<>();
        CircularDoublyLinkedList<Integer> list1=new CircularDoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(8);
        System.out.print("list1: ");
        list.print();

        System.out.println("after version:  ");
        System.out.print("list1:  ");
        list.print();

        System.out.print("list2:  ");
        list1.print();



    }
}
