public class GenericBasics {
    public static void main(String[] args) {
        MyGeneric<Integer> a = new MyGeneric<>(100);
        System.out.println(a);
        MyGeneric<String> b = new MyGeneric<>("ABC");
        System.out.println(b);
    }
}
class MyGeneric<T> {
    T t;
    MyGeneric(T t){
        this.t = t;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
