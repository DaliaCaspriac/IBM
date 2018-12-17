package thinkinginjava.polymorphism.exercise16;

public class Starship {
    private AlertStatus alertStatus = new BlueAlert();

    public void switchToRed(){
        alertStatus = new RedAlert();
    }

    public void switchToOrange(){
        alertStatus = new OrangeAlert();
    }

    public void switchToBlue(){
        alertStatus = new BlueAlert();
    }

    public void displayAlert(){
        alertStatus.alert();
    }
}
