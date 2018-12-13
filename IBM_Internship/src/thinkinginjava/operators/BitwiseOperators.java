package thinkinginjava.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Exercise 10:   (3) Write a program with two constant values, one with alternating
        //binary ones and zeroes, with a zero in the least-significant digit, and the second,
        // also alternating, with a one in the least-significant digit
        //(hint: It’s easiest to use hexadecimal constants for this).
        //Take these two values and combine them in all possible ways using the bitwise operators,
        // and display the results using Integer.toBinaryString( ).
        Integer a = new Integer(0xa); //1010
        Integer b = new Integer(0x9); //1001
        System.out.println("A = " + Integer.toBinaryString(a));
        System.out.println("B = " + Integer.toBinaryString(b));
        System.out.println("~A -> " + Integer.toBinaryString(~a));
        System.out.println("~B -> " + Integer.toBinaryString(~b));
        System.out.println("A & B -> " + Integer.toBinaryString(a & b));
        System.out.println("A | B -> " + Integer.toBinaryString(a | b));
        System.out.println("A ^ B -> " + Integer.toBinaryString(a ^ b));
    }
}