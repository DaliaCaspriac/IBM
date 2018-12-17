package thinkinginjava.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Exercise 9: (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc.
        // In the base class, provide methods that are common to all Rodents,
        // and override these in the derived classes to perform different behaviors
        // depending on the specific type of Rodent.
        // Create an array of Rodent, fill it with different specific types of Rodents,
        // and call your base-class methods to see what happens.
        List<Rodent> all = new ArrayList<>();
        all.add(new Mouse());
        all.add(new Gerbil());
        all.add(new Mouse());
        all.add(new Hamster());
        all.add(new Gerbil());
        for(Rodent rodent : all){
            System.out.println(rodent.eat());
        }

        //Exercise 10:   (3) Create a base class with two methods. In the first method,
        // call the second method. Inherit a class and override the second method.
        // Create an object of the derived class, upcast it to the base type,
        // and call the first method. Explain what happens.
        Rodent r = new Mouse();
        r.sleep();

    }
}
