package patricia;

public class Main {
    public static void main(String[] args) {
        //Create a class that holds the firstname and the surname of a person.
        // Make it have two constructors, one with both firstname and surname,
        // and one with full name (we assume each individual has only one surname
        // and at least one firstname separated by spaces). Test in main class.
        Person person1 = new Person("dalia","caspriac");
        Person person2 = new Person("ioana dalia caspriac");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}