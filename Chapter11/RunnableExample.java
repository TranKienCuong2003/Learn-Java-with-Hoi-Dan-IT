package Chapter11;

class MyRunnable implements Runnable {
    @SuppressWarnings("deprecation")
    @Override
    public void run() {
        System.out.println("Day la luoong: " + Thread.currentThread().getId());
    }
}

public class RunnableExample {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        
        thread1.start();
        thread2.start();
        
        System.out.println("Day la luong chinh: " + Thread.currentThread().getId());
    }
}

