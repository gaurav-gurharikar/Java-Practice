import java.util.*;
public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        
        //Insert
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(1);
        System.out.println(set1);
        
        //Search 
        System.out.println(set1.contains(1));
        System.out.println(set1.contains(9));

        //Delete
        set1.remove(1);

        //Size
        System.out.println(set1.size());

        //Iterator
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(2);
        set2.add(7);
        set2.add(1);
        System.out.println(set2);

        //Intersection
        set1.retainAll(set2);
        System.out.println(set1);

        //Union
        set1.addAll(set2);
        System.out.println(set1);

        //Difference
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
