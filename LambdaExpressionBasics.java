public class LambdaExpressionBasics {
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("Lambda expression");
        obj.sayHello();
    }
}
interface MyInterface {
    void sayHello();
}
