package thinkinginjava.controllingexecution;

import java.util.concurrent.ThreadLocalRandom;

public class Iteration {

    public static void main(String[] args) {
        System.out.println("Exercise 2");
        generate25RandomValues();
        System.out.println("Exercise 4");
        printPrimeNumbers();
    }

    // Exercise 2:(2) Write a program that generates 25 random int values.
    // For each value, use an if-else statement to classify it as greater than, less than,
    // or equal to a second randomly generated value.
    public static void generate25RandomValues() {
        for (int i = 0; i < 25; i++) {
            int rand1 = ThreadLocalRandom.current().nextInt(0, 21);
            int rand2 = ThreadLocalRandom.current().nextInt(0, 21);
            if (rand1 > rand2) {
                System.out.println(rand1 + " GT " + rand2);
            } else if (rand1 < rand2) {
                System.out.println(rand1 + " LT " + rand2);
            } else {
                System.out.println(rand1 + " EQ " + rand2);
            }
        }
    }

    //Exercise 4: (3) Write a program that uses two nested for loops and
    //the modulus operator (%) to detect and print prime numbers (integral numbers
    //that are not evenly divisible by any other numbers except for themselves and 1).
    public static void printPrimeNumbers() {
        boolean isPrime = true;
        for (int number = 0; number < 100; number++) {
            isPrime = true;
            if (number < 2) {
                continue;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + ", ");
            }
        }
    }
}