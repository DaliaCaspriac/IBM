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

        //Exercise 17: (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method
        // to Unicycle and Bicycle, but not to Tricycle.
        // Create instances of all three types and upcast them to an array of Cycle.
        // Try to call balance( ) on each element of the array and observe the results.
        // Downcast and call balance( ) and observe what happens.
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        Cycle[] cycles = new Cycle[3];
        cycles[0] = unicycle;
        cycles[1] = bicycle;
        cycles[2] = tricycle;
//        for(int i = 0; i < cycles.length; i++){
//            //cycles[i].balance(0); cannot find the method
//        }
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();
//        ((Tricycle)cycles[2]).balance(); cannot find the method


    }
}
