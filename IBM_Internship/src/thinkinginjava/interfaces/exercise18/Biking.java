package thinkinginjava.interfaces.exercise18;

public class Biking {
    public static void rideCycle(CycleFactory cycle){
        Cycle c = cycle.getCycle();
        c.ride();
    }

    public static void main(String[] args) {
        UnicycleFactory unicycle = new UnicycleFactory();
        rideCycle(unicycle);
        BicycleFactory bicycleFactory = new BicycleFactory();
        rideCycle(bicycleFactory);
        TricycleFactory tricycleFactory = new TricycleFactory();
        rideCycle(tricycleFactory);
    }
}
