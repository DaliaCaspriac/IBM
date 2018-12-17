package thinkinginjava.initializationandcleanup;

import static thinkinginjava.initializationandcleanup.Dog.blanita;

public class Main {

    public static void main(String[] args) {
        Constructors con = new Constructors();
        //Exercise 1:   (1) Create a class containing an uninitialized String reference.
        // Demonstrate that this reference is initialized by Java to null.
        System.out.println(null == con.getField() ? "Null" : "Not null");

        //Exercise 2:   (2) Create a class with a String field that is initialized
        //at the point of definition, and another one that is initialized by the constructor.
        // What is the difference between the two approaches?
        System.out.println(con.getField2());
        System.out.println(con.getField3());

        //Exercise 3: (1) Create a class with a default constructor (one that takes no arguments)
        // that prints a message. Create an object of this class.
        Dog dog = new Dog();
        System.out.println(Dog.blanita);

        //Exercise 4:   (1) Add an overloaded constructor to the previous exercise
        // that takes a String argument and prints it along with your message
        Dog dog2 = new Dog("Lord");

        //Exercise 5:   (2) Create a class called Dog with an overloaded bark( ) method.
        // This method should be overloaded based on various primitive data types,
        // and print different types of barking, howling, etc., depending on which overloaded
        //version is called. Write a main( ) that calls all the different versions.
        dog2.bark();
        dog2.bark(1);
        dog2.bark('d');
        dog2.bark(true);
        dog2.bark(1234567L);
        dog2.bark(84.3f);
        dog2.bark(39.5d);

        //Exercise 8: (1) Create a class with two methods. Within the first method,
        // call the second method twice: the first time without using this,
        // and the second time using this—just to see it working;
        // you should not use this form in practice.
        System.out.println("Exercise 8");
        ThisClass c = new ThisClass();
        c.first();

        //Exercise 21: (1) Create an enum of the least-valuable six types of paper currency.
        // Loop through the values( ) and print each value and its ordinal( ).
        for (PaperCurrency item : PaperCurrency.values()) {
            System.out.println(item);
            System.out.println("Ordinal " + item.ordinal());
        }


        //Exercise 22: (2) Write a switch statement for the enum in the previous example.
        // For each case, output a description of that particular currency.
        for (PaperCurrency item : PaperCurrency.values()) {
            switch (item) {
                case ONE:
                    System.out.println("Green");
                    break;
                case FIVE:
                    System.out.println("Purple");
                    break;
                case TEN:
                    System.out.println("Orange");
                    break;
                case FIFTY:
                    System.out.println("Yellow");
                    break;
                case HUNDRED:
                    System.out.println("Blue");
                    break;
                default:
                    System.out.println("no paper currency");
            }
        }
    }
}