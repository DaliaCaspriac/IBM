package thinkinginjava.operators;

public class MathematicalOperators {

    private static final double CONSTANT_DISTANCE = 50d; // 50km
    private static final double CONSTANT_TIME = 6d; // 6h

    public MathematicalOperators(){}

    /*
     Write a program that calculates velocity using a constant distance and a constant time
     */
    public static double calculateVelocity(){
        return CONSTANT_DISTANCE / CONSTANT_TIME;
    }

    public static void main(String[] args) {
        System.out.println("Velocity: " + calculateVelocity() + " km/h");
    }
}
