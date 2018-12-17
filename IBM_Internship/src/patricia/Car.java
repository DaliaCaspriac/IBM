package patricia;

public class Car extends Vehicle {
    private String model;

    static {
        System.out.println("Static block from Car class");
    }

    public Car(String model) {
        super(4, true);
        this.model = model;
        System.out.println("Car constructor");
    }


}
