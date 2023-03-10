package H.W.Lab4;

public class Q6 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer>l=new SinglyLinkedList<>();

        l.addFirst(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.addLast(7);
        l.addLast(8);
        l.addLast(9);
        l.revers(l);
        while (!l.isEmpty()){
            System.out.print(l.removeFirst()+" , ");
        }
    }
}
