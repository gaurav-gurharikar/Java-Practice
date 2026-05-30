import java.util.*;

public class ArrayDequeBasics {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        //Add
        q.offer(10);
        q.offer(20);
        System.out.println(q);

        //Add at first
        q.offerFirst(5);
        System.out.println(q);
        
        //Add at last
        q.offerLast(50);
        System.out.println(q);

        //Remove first position
        q.poll();
        System.out.println(q);

        //Remove last position
        q.pollLast();
        System.out.println(q);

        //Peek
        System.out.println(q.peek());

        //Peek last
        System.out.println(q.peekLast());
    }
}
