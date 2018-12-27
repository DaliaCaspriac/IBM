package thinkinginjava.strings.exercise06;

public class Exercise06 {
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;

    public Exercise06(int anInt, long aLong, float aFloat, double aDouble){
        this.anInt = anInt;
        this.aLong = aLong;
        this.aFloat = aFloat;
        this.aDouble = aDouble;
    }

    @Override
    public String toString() {
        return String.format("anInt = %d\n aLong = %d\n aFloat = %f\n aDouble = %f\n",
                anInt,aLong,aFloat,aDouble);
    }
}
