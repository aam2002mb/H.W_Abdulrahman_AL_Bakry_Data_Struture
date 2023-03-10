package H.W.Lab2;

public class Q1 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,8,9};
        int[] b = new int[a.length];
        System.out.println("Original List");
        for (int i = 0; i < a.length; i++) {
            System.out.print( a[i]+ ",");
        }
        System.out.println("\nRevers List");
        for (int i = 0; i < b.length; i++) {
            b[i] = a[a.length - 1 - i];
            System.out.print(b[i] + ",");
        }
    }
}
