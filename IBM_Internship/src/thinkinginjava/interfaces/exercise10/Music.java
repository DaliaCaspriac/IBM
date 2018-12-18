package thinkinginjava.interfaces.exercise10;

public class Music {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void tune(Playable i) {
        // ...     i.play(Note.MIDDLE_C);
        i.play("LA");
    }

    static void tuneAll(Playable[] e) {
        for (Playable i : e) tune(i);
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {new Wind(), new Percussion(), new Stringed()};
        tuneAll(orchestra);
    }
}
