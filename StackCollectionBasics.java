import java.util.*;

public class StackCollectionBasics {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //Push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        //Peek (top element)
        System.out.println(stack.peek());

        //Pop
        stack.pop();
        System.out.println(stack);

        //Search element
        System.out.println(stack.search(20));

        //Check empty
        System.out.println(stack.isEmpty());

        //Size
        System.out.println(stack.size());

        //Get
        System.out.println(stack.get(1));

        //Update element
        stack.set(0, 100);
        System.out.println(stack);

        //Contains
        System.out.println(stack.contains(100));

        //Sort stack
        Collections.sort(stack);
        System.out.println(stack);

        //Iteration
        Iterator<Integer> iterator = stack.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Convert to array
        Object[] arr = stack.toArray();
        for(Object element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clear stack
        stack.clear();
        System.out.println(stack);

    }
}