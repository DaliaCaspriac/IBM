package thinkinginjava.interfaces.exercise10;

public class Stringed implements Instrument, Playable {
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