import java.util.*;
public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        //Add
        list.add(50);
        list.add(20);
        System.out.println(list);

        //Get
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        //Add element in between
        list.add(1,15);
        System.out.println(list);

        //Add at first position
        list.addFirst(123);
        System.out.println(list);

        //Add at last position
        list.addLast(456);
        System.out.println(list);

        //Change or update element
        list.set(0, 100);
        System.out.println(list);

        //Delete
        list.remove(2);
        System.out.println(list);

        //Delete first position
        list.removeFirst();
        System.out.println(list);

        //Delete first position
        list.removeLast();
        System.out.println(list);

        //Size
        System.out.println(list.size());

        //Sorting
        Collections.sort(list);
        System.out.println(list);

        //Iteration
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        //Convert to array
        Object[] arr = list.toArray();
        for(Object element: arr) {
            System.out.print(element+" ");
        }
        System.out.println();

        //Contains
        System.out.println(list.contains(100));

    }
}
