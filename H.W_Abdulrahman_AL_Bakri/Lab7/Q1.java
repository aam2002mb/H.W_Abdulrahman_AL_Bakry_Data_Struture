package H.W.Lab7;

public class Q1 {
    public static void main(String[] args) {
        StackLinkedList<Integer>list=new StackLinkedList<>();
        StackLinkedList<Integer>list1=new StackLinkedList<>();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list1.Transfer(list,list1);
        list1.print(list1);
        System.out.println();
        while (!list1.isEmpty()){
            System.out.print(list1.pop()+" , ");
        }

    }
}
