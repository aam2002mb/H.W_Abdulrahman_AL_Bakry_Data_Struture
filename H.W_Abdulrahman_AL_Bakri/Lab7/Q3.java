package H.W.Lab7;

public class Q3 {
    public static void main(String[] args) {
        StackArray<Integer>list=new StackArray<>();
        StackArray<Integer>list1=new StackArray<>();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        System.out.print("List1 : ");
        list.print(list);
        list1= list1.clone(list);
        System.out.print("\nList2 : ");
        list1.print(list1);
    }
}
