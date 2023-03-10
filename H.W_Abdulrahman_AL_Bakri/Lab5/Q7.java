package H.W.Lab5;

public class Q7 {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer>l=new CircularlyLinkedList<>();
        CircularlyLinkedList<Integer>list=new CircularlyLinkedList<>();
        l.addFirst(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.addLast(7);
        l.addLast(8);
        l.addLast(9);

        System.out.print("l : ");
        l.print();

        list=list.clone(l);
        System.out.println("after clone:  ");
        System.out.print("l :  ");
        l.print();

        System.out.print("list :  ");
        list.print();



    }
}
