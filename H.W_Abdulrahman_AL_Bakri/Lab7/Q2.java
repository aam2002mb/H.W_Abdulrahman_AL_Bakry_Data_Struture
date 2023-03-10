package H.W.Lab7;

public class Q2 {
    public static void main(String[] args) {
    StackLinkedList<Integer>list=new StackLinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.print(list);
        System.out.println();
        System.out.print("The element deleted :  ");
        list= list.recursive(list);
        System.out.println();
        list.print(list);


}
}
