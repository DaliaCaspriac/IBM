package patricia;

public class Main {
    public static void main(String[] args) {
        //Create a class that holds the firstname and the surname of a person.
        // Make it have two constructors, one with both firstname and surname,
        // and one with full name (we assume each individual has only one surname
        // and at least one firstname separated by spaces). Test in main class.
        System.out.println("---------Ex 1--------");
        Person person1 = new Person("dalia","caspriac");
        Person person2 = new Person("ioana dalia caspriac");
        System.out.println(person1.toString());
        System.out.println(person2.toString());

        //Create a class called Tank that can be filled and emptied
        // (let’s say it has acts like a stack), and has a termination condition
        // that it must be empty when the object is cleaned up.
        // Write a finalize() that verifies this termination condition.
        // In main(), test the possible scenarios that can occur when your Tank is used.
        // Add objects to the tank and then call the garbage collector.
        System.out.println("--------Ex 2---------");
        Tank tank1 = new Tank();
        tank1.add(new Integer(2));
        tank1.add(new Integer(5));

        new Tank().add(10);

        Tank tank2 = new Tank();
        tank2.add(new Integer(3));
        tank2.add(new Integer(9));
        tank2.empty();

        Tank tank4 = new Tank();
        tank4.add(10);
        tank4 = new Tank();
        System.gc();

        //Create a small application that demonstrates (with sysouts)
        // the order in which constructors, local variables, fields, static blocks
        // are initialized / called - consider using superclasses as well.
        System.out.println("------Ex 3--------");
        Car car = new Car("audi");
    }
}