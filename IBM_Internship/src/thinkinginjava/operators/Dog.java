package thinkinginjava.operators;

public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        //Exercise 5: (2) Create a class called Dog containing two Strings: name and says.
        // In main( ), create two dog objects with names “spot” (who says, “Ruff!”)
        // and “scruffy” (who says, “Wurf!”). Then display their names and what they say.
        Dog spot = new Dog("Spot", "Ruff!");
        Dog scruffy = new Dog("Scruffy", "Wurf!");
        System.out.println(spot.name + " says " + spot.says);
        System.out.println(scruffy.name + " says " + scruffy.says);

        //Exercise 6:(3) Following Ex5, create a new Dog reference and assign it to spot’s object.
        // Test for comparison using == and equals( ) for all references.
        Dog happy = new Dog("Happy", "Woof!");
        System.out.println(happy.name + " says " + happy.says);
        System.out.println(happy == spot ? "Happy == Spot" : "Happy != Spot");
        System.out.println(happy.equals(spot) ? "Happy equals Spot" : "Happy !equals Spot");
        spot = happy;
        System.out.println(happy == spot ? "Happy == Spot" : "Happy != Spot");
        System.out.println(happy.equals(spot) ? "Happy equals Spot" : "Happy !equals Spot");
        System.out.println(spot.name + " says " + spot.says);
    }
}