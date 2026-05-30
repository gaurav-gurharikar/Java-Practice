import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorBasics {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(20, "ABC", 60));
        students.add(new Students(21, "PQR", 70));
        students.add(new Students(19, "XYZ", 65));
        System.out.println(students);

        Collections.sort(students, new Comparator<Students>() {
            @Override
            public int compare(Students s1, Students s2) {
                return s1.weight - s2.weight;
            }
        });
        System.out.println(students);
    }
}
class Students{
    int age;
    String name;
    int weight;
    Students(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nAge: "+age+" Name: "+name+" Weight: "+weight;
    }
}
