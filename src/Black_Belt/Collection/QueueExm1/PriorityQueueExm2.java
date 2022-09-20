package Black_Belt.Collection.QueueExm1;
import java.util.PriorityQueue;

public class PriorityQueueExm2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(8);
        pq.add(2);
        pq.add(5);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq.element());
        pq.remove();
        System.out.println(pq.element());
        pq.remove();
        System.out.println(pq.element());
        pq.remove();
        System.out.println(pq.element());
    }
}