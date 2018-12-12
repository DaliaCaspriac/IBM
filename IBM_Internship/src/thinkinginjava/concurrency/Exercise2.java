package thinkinginjava.concurrency;

public class Exercise2 implements Runnable {
    private int n;

    public Exercise2(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        String fib = "";
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < n; i++) {
            fib += gen.next() + " ";
        }
        System.out.println("T" + Thread.currentThread().getId() + " = " + fib);
        Thread.yield();
    }

}
