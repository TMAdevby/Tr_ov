package bl_belt.multithreading.o14_AtomickInteger;

public class AtomicInteger {
    static int counter = 0;

    public static void increment(){
        counter++;
    }

    public static void main(String[] args) {

    }
}

class MyRunnableImpl18 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicInteger.increment();
        }
    }
}
