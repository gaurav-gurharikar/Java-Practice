import java.util.*;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>();

        q1.add(40);
        q1.add(20);
        q1.add(10);
        q1.add(60);
        System.out.println(q1);

        //Default behaviour for integers: Lesser value = Higher priority
        System.out.println(q1.peek());

        PriorityQueue<Integer> q2 = new PriorityQueue<>((a,b)->b-a);
        //MaxHeap: Greater value = Higher priority
        q2.add(40);
        q2.add(20);
        q2.add(10);
        q2.add(60);
        System.out.println(q2);
        System.out.println(q2.peek());
    }
}
