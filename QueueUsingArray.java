public class QueueUsingArray {
    static int[] queue = new int[10];
    static int front = -1, rear = -1;

    //Enqueue
    public static void enqueue(int value) {
        if((rear+1)%queue.length == front) {
            System.out.println("Queue overflow");
            return;
        }
        if(front == -1) front++;
        rear = (rear+1)%queue.length;
        queue[rear] = value;
    }

    //Dequeue
    public static void dequeue(){
        if(front == -1){
            System.out.println("Queue underflow");
            return;
        }
        if(front == rear){
            front = -1;
            rear = -1;
        } else front = (front+1)%queue.length;
    }

    //Size
    public static int size(){
        if(front == -1) return 0;
        if(rear >= front) return rear-front+1;
        return queue.length-front+rear+1;
    }

    //Display
    public static void display(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("----------");
        int i = front;
        while (true){
            System.out.println(queue[i]);
            if(i == rear) break;
            i = (i+1)%queue.length;
        }
        System.out.println("----------");
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        System.out.println(size());
        display();
        dequeue();
        display();
        dequeue();
        display();
    }
}