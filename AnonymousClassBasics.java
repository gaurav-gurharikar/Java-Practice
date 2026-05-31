public class AnonymousClassBasics {
    public static void main(String[] args) {
        AnonymousClass x = new AnonymousClass();
        x.sayHello();
        AnonymousClass y = new AnonymousClass() {
            @Override
            public void sayHello() {
                System.out.println("Hello, this is an anonymous class.");
            }
        };
        y.sayHello();
    }
}
class AnonymousClass {
    public void sayHello() {
        System.out.println("Hello, this is an original class.");
    }
}