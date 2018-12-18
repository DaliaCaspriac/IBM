package thinkinginjava.interfaces.exercise09;

public class Percussion extends Instrument {
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
