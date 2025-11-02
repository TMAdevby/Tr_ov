package bl_belt.multithreading;

public class Ex2 {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
        Thread myThread3 = new Thread(new MyThread3());
        Thread myThread4 = new Thread(new MyThread4());
//        myThread1.start();
//        myThread2.start();
        myThread3.start();
        myThread4.start();
    }
}

class MyThread1 extends Thread{
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread{
    public void run() {
        for (int i = 1000; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}

class MyThread3 implements Runnable{
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable{
    public void run() {
        for (int i = 1000; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}
