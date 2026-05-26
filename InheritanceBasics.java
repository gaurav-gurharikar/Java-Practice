class Parent {
    public void displayParent() {
        System.out.println("This a parent method");
    }
}
class Child extends Parent {
    public void displayChild() {
        System.out.println("This is a child method");
    }
}
public class InheritanceBasics {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.displayParent();
        Child c = new Child();
        c.displayChild();
        c.displayParent();
    }
}
