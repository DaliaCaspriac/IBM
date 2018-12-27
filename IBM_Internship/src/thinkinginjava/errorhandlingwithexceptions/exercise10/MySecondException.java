package thinkinginjava.errorhandlingwithexceptions.exercise10;

public class MySecondException extends Exception {
    private String msg;
    public MySecondException(String msg){
        super(msg);
        this.msg = msg;
    }

    public String getMessage(){
        return "Catch MySecondException \n" + msg;
    }
}
