package thinkinginjava.concurrency;

public class Exercise1 implements Runnable {

    public Exercise1(){
        System.out.println(Thread.currentThread().getId() + " Startup message ");
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() +" Message from run() method ");
        Thread.yield();
        System.out.println(Thread.currentThread().getId() + " Shutdown message ");
    }
}
