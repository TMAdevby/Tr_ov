package bl_belt.multithreading;

public class Ex2 {

}

class MyThread1 extends Thread{
    public void run() {
        for (int i = 0; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread{
    public void run() {
        for (int i = 1000; i > 0 ; i++) {
            System.out.println(i);
        }
    }
}
