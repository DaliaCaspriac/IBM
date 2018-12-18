package thinkinginjava.interfaces.exercise09;

public class Stringed extends Instrument {
    @Override
    public void play(String n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Stringed";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}