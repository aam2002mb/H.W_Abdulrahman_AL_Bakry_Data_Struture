package H.W.Lab6;

public class Q5 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer>list=new DoublyLinkedList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.print();
        System.out.print(list.size());
        while (!list.isEmpty()){
            System.out.print(list.removeFirst()+" , ");
            System.out.print(list.size());

        }
        list.print();
    }
}
