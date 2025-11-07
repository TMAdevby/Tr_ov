package bl_belt.multithreading.o5_deadlock;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock5 = new Object();
}


class Thread10 extends Thread{
    @Override
    public void run() {
        synchronized (DeadLockEx.lock1)
    }
}
