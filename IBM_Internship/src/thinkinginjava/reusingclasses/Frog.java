package thinkinginjava.reusingclasses;

public class Frog extends Amphibian {
    @Override
    public void say() {
        System.out.println("say frog");
    }

    @Override
    public void eat() {
        System.out.println("eat spiders");
    }

    @Override
    public void drink() {
        System.out.println("drink coke");
    }
}
