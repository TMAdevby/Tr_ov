package bl_belt.multithreading.o3_vol_synchronized;

public class Ex12 {

    void mobileCall() {
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mobile call ends");
    }

    void skypeCall() {
        System.out.println("Skype call starts");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skype call ends");
    }

    void whatsappCall() {
        System.out.println("Whatsapp call starts");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Whatsapp call ends");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplMobile());
        Thread thread3 = new Thread(new RunnableImplMobile());
    }
}

class RunnableImplMobile implements Runnable{
    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImplSkype implements Runnable{
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImplWhatsapp implements Runnable{
    @Override
    public void run() {
        new Ex12().whatsappCall();
    }
}