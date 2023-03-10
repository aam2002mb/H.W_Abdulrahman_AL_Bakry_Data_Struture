package H.W.Lab4;

public class Q2 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> a=new SinglyLinkedList<>();
        a.addFirst(1);
        a.addLast(2);
        a.addLast(3);
        a.addLast(4);
        a.addLast(5);

        System.out.println(a.second_to_last());
    }
}
