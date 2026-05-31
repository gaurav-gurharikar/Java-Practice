public class MultithreadingBasics {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

        MyRunnable1 r1 = new MyRunnable1();
        Thread thread1 = new Thread(r1);
        MyRunnable2 r2 = new MyRunnable2();
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();
    }
}
class MyThread1 extends Thread {
    public void run() {
        int i=0;
        while (i<100) {
            System.out.print(1);
            i++;
        }    
    }
}
class MyThread2 extends Thread {
    public void run() {
        int i=0;
        while (i<100) {
            System.out.print(2);
            i++;
        }    
    }
}
class MyRunnable1 implements Runnable {
    public void run() {
        int i=0;
        while(i<100) {
            System.out.print("X");
            i++;
        }
    }
}
class MyRunnable2 implements Runnable {
    public void run() {
        int i=0;
        while(i<100) {
            System.out.print("Y");
            i++;
        }
    }
}