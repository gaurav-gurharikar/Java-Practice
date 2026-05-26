class Person {
    String name;
    int age;

    public void printInfo(String name) {
        this.name = name;
        System.out.println("Name: "+name);
    }
    public void printInfo(int age) {
        this.age = age;
        System.out.println("Age: "+age);
    }
    public void printInfo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class PolymorphismBasics {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.printInfo("ABC");
        p1.printInfo(20);
        p1.printInfo("ABC", 20);
    }
}
