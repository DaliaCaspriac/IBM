package thinkinginjava.initializationandcleanup;

public class Dog {

    private String name;

    //Exercise 3: (1) Create a class with a default constructor (one that takes no arguments)
    // that prints a message. Create an object of this class.
    public Dog(){
        System.out.println("default constructor");
    }

    //Exercise 4:   (1) Add an overloaded constructor to the previous exercise
    // that takes a String argument and prints it along with your message
    public Dog(String name){
        System.out.println("Dog constructor " + name);
        this.name = name;
    }

    //Exercise 5:   (2) Create a class called Dog with an overloaded bark( ) method.
    // This method should be overloaded based on various primitive data types,
    // and print different types of barking, howling, etc., depending on which overloaded
    //version is called. Write a main( ) that calls all the different versions.
    public void bark(int value){
        System.out.println("iii");
    }

    public void bark(double value){
        System.out.println("ddd");
    }

    public void bark(float value){
        System.out.println("fff");
    }

    public void bark(boolean value){
        System.out.println("bbb");
    }

    public void bark(short value){
        System.out.println("sss");
    }

    public void bark(long value){
        System.out.println("lll");
    }

    public void bark(char value){
        System.out.println("ccc");
    }

    public void bark(){
        System.out.println("nothing");
    }

}
