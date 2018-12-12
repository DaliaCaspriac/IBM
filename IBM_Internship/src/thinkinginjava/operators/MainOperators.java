package thinkinginjava.operators;

import static sun.misc.Version.print;

public class MainOperators {
    static void f(Product product) {
        product.price = 22.22f;
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.price = 11.11f;
        System.out.println("1. Before f() method: price = " + product.price);
        f(product);
        System.out.println("2. After f() method: price = " + product.price);
    }
}
