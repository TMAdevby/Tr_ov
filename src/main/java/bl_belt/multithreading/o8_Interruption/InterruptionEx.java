package bl_belt.multithreading.o8_Interruption;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    @Override
    public void run() {
        for(int i = 1; i<=1000000000; i++){
            if(isInterrupted()){
                System.out.println("Potok xotyat prervat");
                System.out.println("Мы убедились что состояние" +
                        " всех объектов нормальное и решили завершить работу потока");
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potok xotat prervat wo vrema sna" +
                        " davaite ego zavershim ");
                System.out.println(sqrtSum);
            }
        }
        System.out.println(sqrtSum);
    }
}
