package thinkinginjava.polymorphism;

public class Rodent {

    public String eat(){
        return "My food";
    }

    public void sleep(){
        System.out.println("After " + eat() + " ...coming sleep...");
    }
}
