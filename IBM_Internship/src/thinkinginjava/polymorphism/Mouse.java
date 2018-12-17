package thinkinginjava.polymorphism;

public class Mouse extends Rodent {

    public String eat() {
        return "cheese";
    }

    @Override
    public void sleep() {
        System.out.println("Mouse sleep..........");
    }
}
