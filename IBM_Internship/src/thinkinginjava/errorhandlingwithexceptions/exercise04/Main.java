package thinkinginjava.errorhandlingwithexceptions.exercise04;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException("my exception message...");
        }catch (MyException ex){
            System.out.println(ex.getMessage());
        }
    }
}
