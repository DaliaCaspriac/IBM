package thinkinginjava.interfaces.exercise10;

public interface Instrument {
    // Compile-time constant:
    int VALUE = 5;     // static & final

    // Cannot have method definitions:
    void play(String n); // Automatically public

    void adjust();
}
