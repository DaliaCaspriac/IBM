package thinkinginjava.initializationandcleanup;

public class Constructors {

    private String field;
    private String field2 = "IBM";
    private String field3;

    public Constructors(){
        this.field3 = "Liberty Park";
    }

    public String getField(){
        return field;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }
}