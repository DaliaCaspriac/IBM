package thinkinginjava.interfaces.exercise09;

public class Wind extends Instrument {
    public void play(String n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}
