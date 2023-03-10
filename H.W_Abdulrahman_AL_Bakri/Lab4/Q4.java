package H.W.Lab4;

public class Q4 {
    public static void main(String[] args) {
        SinglyLinkedList<Integer>l=new SinglyLinkedList<>();

        l.addFirst(11);
        l.addLast(12);
        l.addLast(13);
        l.addLast(14);
        l.addLast(15);
        l.rotate();
        while (!l.isEmpty()){
            System.out.print(l.removeFirst()+" , ");
        }
    }
}
