package thinkinginjava.operators;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class LogicalOperators {
    //Exercise 7:   (3) Write a program that simulates coin-flipping
    public static void coinFlipping(){
        int randomNum = ThreadLocalRandom.current().nextInt(0,11);
        System.out.println(randomNum % 2 == 0 ? "Heads" : "Tails");
    }
    public static void main(String[] args) {
        coinFlipping();
    }
}
