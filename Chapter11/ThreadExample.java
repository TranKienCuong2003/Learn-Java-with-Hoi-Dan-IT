package Chapter11;

class MyThread extends Thread {
    @SuppressWarnings("deprecation")
    @Override
    public void run() {
        System.out.println("Day la luong: " + Thread.currentThread().getId());
    }
}

public class ThreadExample {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        
        thread1.start();
        thread2.start();
        
        System.out.println("Day la luong chinh: " + Thread.currentThread().getId());
    }
}

