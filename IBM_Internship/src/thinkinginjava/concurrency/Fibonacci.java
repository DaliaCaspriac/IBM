package thinkinginjava.concurrency;

public class Fibonacci {
    private int count = 0;

    public int next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.println(gen.next() + " ");
        }
    }
}
