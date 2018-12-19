package thinkinginjava.holdingyourobjects.exercise27;


public class Command {
    private String str;

    public Command(String str) {
        this.str = str;
    }

    public String operation() {
        return str;
    }
}
