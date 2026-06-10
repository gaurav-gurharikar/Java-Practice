public class StackUsingArray {
    static int stack[] = new int[10];
    static int top = -1;
    
    //Push
    public static void push(int value) {
        if(top == stack.length-1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top] = value;
    }

    //Pop
    public static void pop() {
        if(top == -1) {
            System.out.println("Stack underflow");
            return;        
        }
        top--;
    }

    //Display
    public static void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("----------");
        for(int i = top; i >=0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("----------");
    }

    //Size
    public static int size() {
        return top+1;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        System.out.println(size());
        display();
        pop();
        display();
        pop();
        display();
    }
}
