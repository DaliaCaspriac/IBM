package thinkinginjava.errorhandlingwithexceptions.exercise10;

public class MyFirstException extends Exception{
    private String msg;
    public MyFirstException(String msg){
        super(msg);
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return "Catch myFirstException \n" + msg;
    }
}
