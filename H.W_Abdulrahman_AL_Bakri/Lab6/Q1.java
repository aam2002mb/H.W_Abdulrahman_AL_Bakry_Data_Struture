package H.W.Lab6;

public class Q1 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> i=new DoublyLinkedList<>();
        i.addFirst(1);
        i.addLast(2);
        i.addLast(3);
        i.addLast(4);
        i.addLast(5);
        i.addLast(6);
        System.out.println("Size of list= "+i.size());
        System.out.println("element of middle node= "+i.GetMiddle(i).element);


    }
}
