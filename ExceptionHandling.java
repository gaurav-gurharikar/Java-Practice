public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5, b = 0;
        try {
            int c = divide(a, b);
            System.out.println(c);
        } catch(MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }
    static int divide(int a, int b) throws MyException {
        if(b==0) {
            throw new MyException();
        }
        return a/b;
    }
}
class MyException extends Exception {
    MyException() {
        super("Cannot divide by zero");
    }
    @Override
    public String getMessage() {
        return super.getMessage()+" This is a custom exception";
    }
}