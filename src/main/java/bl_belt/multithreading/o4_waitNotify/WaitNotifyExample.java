package bl_belt.multithreading.o4_waitNotify;

public class WaitNotifyExample {
    public static void main(String[] args) {

    }
}

class Market{
    private int breadCount = 0;

    public synchronized void getBread(){
        while(breadCount<1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Количество хлеба в магазине = " + breadCount);
        notify();
    }

    public synchronized void putBread(){
        while (breadCount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Производитель добавил на витрину 1 хлеб");

    }
}
