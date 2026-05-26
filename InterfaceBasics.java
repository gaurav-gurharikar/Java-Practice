interface Omnivore {
    void eatMeat();  
}
interface Herbivore {
    void eatGrass();
}
class Carnivore implements Herbivore, Omnivore {
    public void eatGrass() {
        System.out.println("Eats grass");
    }
    public void eatMeat() {
        System.out.println("Eats meat");
    }
}
public class InterfaceBasics {
    public static void main(String[] args) {
        Carnivore c = new Carnivore();
        c.eatGrass();
        c.eatMeat();
    }
}
