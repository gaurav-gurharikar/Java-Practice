abstract class Animal {
    abstract void walk();
    public void run() {
        System.out.println("Runs");
    }
}
class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
public class AbstractionBasics {
    public static void main(String[] args) {
        Horse h =  new Horse();
        h.walk();
        h.run();;
        Chicken c = new Chicken();
        c.walk();
        c.run();
    }
}
