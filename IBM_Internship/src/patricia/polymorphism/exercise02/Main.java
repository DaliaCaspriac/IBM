package patricia.polymorphism.exercise02;

public class Main {

    public static void main(String[] args) {
        Amphibian froggy = new Frog();
        System.out.println(froggy.eat());
        System.out.println(froggy.sleep());
    }
}