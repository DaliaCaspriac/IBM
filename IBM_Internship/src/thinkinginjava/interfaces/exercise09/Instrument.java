package thinkinginjava.interfaces.exercise09;

public abstract class Instrument {
    // Compile-time constant:
    int VALUE = 5;     // static & final

    // Cannot have method definitions:
    public abstract void play(String n); // Automatically public

    public abstract  void adjust();
}
