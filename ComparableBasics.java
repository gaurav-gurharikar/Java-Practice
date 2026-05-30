import java.util.*;

public class ComparableBasics {
    public static void main(String[] args) {
        List<MyStudents> students = new ArrayList<>();
        students.add(new MyStudents(20, "ABC", 60));
        students.add(new MyStudents(21, "PQR", 70));
        students.add(new MyStudents(19, "XYZ", 65));
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);
    }
}
class MyStudents implements Comparable<MyStudents>{
    int age;
    String name;
    int weight;
    MyStudents(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nAge: "+age+" Name: "+name+" Weight: "+weight;
    }

    @Override
    public int compareTo(MyStudents s) {
        if(this.age == s.age) {
            return this.name.compareTo(s.name);
        }
        return this.age - s.age;
    }
}
