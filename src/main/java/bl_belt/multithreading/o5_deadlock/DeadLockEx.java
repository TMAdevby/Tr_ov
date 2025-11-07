package bl_belt.multithreading.o5_deadlock;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();
}


class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread10: Попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread10: Монитор объекта lock1 захвачен");
            System.out.println("Thread10: Попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread10: Мониторы объектов lock1 " +
                        "и lock2 захвачены");
            }
        }
    }
}
