class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    //Non-parameterized constructor
    Student() {
        System.out.println("This is a non-parameterised constructor");
    }

    //Parameterized constructor
    Student(String name, int age) {
        System.out.println("This is a parameterised constructor");
        this.name = name;
        this.age = age;
    }

    //Copy constructor
    Student(Student s2) {
        System.out.println("This is a copy constructor");
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class ConstructorBasics {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo();
        Student s2 = new Student("ABC", 19);
        s2.printInfo();
        Student s3 = new Student(s2);
        s3.printInfo();
    }
}
