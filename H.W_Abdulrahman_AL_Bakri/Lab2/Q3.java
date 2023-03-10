package H.W.Lab2;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
        int len = arr.length;
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < len-1; i++) {
            if (arr[i]!=arr[i+1]){
                temp [j++] = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
