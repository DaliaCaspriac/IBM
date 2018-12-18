package thinkinginjava.interfaces.exercise11;

public abstract class StringProcessor implements Processor {
    public abstract String process(Object input);

    public String name() {
        return getClass().getSimpleName();
    }
}