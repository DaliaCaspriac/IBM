package thinkinginjava.interfaces.exercise10;

public class Percussion implements Instrument, Playable {
    public void play(String n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Percussion";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}
