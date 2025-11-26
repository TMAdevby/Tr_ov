package bl_belt.multithreading.o1_createThread;

public class Ex3 implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000 ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Ex3());
        thread1.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }

//        Thread myThread3 = new Thread(new MyThread3());
//        Thread myThread4 = new Thread(new MyThread4());
//
//        myThread3.start();
//        myThread4.start();
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
