package H.W.Lab8;

public class Q4 {
    public static void main(String[] args) {
        int position = 7;
        int count =3;
        printJosephusPositions(count, position);
    }
    public static void printJosephusPositions(int count, int position) {
        QueueLinkedList<Integer> queue = new QueueLinkedList<>();
        for (int i = 0; i < count; i++) {
            queue.enqueue(i);
        }

        while(!queue.isEmpty()) {
            for (int i = 1; i <= position; i++) {
                int eliminatedPosition = queue.dequeue();
                if (i == position) {
                    System.out.println(eliminatedPosition + " ");
                    break;
                }
                queue.enqueue(eliminatedPosition);
            }

        }
    }
}
