class Pen {
    String type;
    String colour;

    public void details() {
        System.out.println("Type: "+type);
        System.out.println("Colour: "+colour);
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.type = "Ballpoint";
        p1.colour = "Blue";
        p1.details();
    }
}
