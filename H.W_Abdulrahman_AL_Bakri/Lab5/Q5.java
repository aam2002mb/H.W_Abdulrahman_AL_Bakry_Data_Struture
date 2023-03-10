package H.W.Lab5;

public class Q5 {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer>l =new CircularlyLinkedList<>();
        CircularlyLinkedList<Integer> ll=new CircularlyLinkedList<>();
        l.addFirst(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(7);
        l.addLast(8);
        l.addLast(9);
        l.addLast(10);
        System.out.print("l : ");
        l.print();

        ll=ll.split(l);
        System.out.println("After Split:  ");
        System.out.print("ll:  ");
        ll.print();

        System.out.print("l :  ");
        l.print();


    }
}

