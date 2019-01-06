package thinkinginjava.generics.exercise25;

public class Main {
    <T extends InterfaceOne> void one(T elem){
        System.out.println("One " + elem);
    }
    <T extends InterfaceTwo> void two(T elem){
        System.out.println("Two " + elem);
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Main main = new Main();
        main.one(myClass);
        main.two(myClass);
    }
}
