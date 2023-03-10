package H.W.Lab4;

public class Test {
    public static void main(String[] args) {
        SinglyLinkedList<String> a=new SinglyLinkedList<>();
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        a.addFirst("Abdulrahman");
        a.addLast("Ali");
        a.addLast("Al-Bakri");

        while (!a.isEmpty()){
            System.out.print(a.removeFirst()+" ");
        }
    }
}
