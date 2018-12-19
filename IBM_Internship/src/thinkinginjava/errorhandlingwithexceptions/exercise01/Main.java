package thinkinginjava.errorhandlingwithexceptions.exercise01;

public class Main {
    public static void main(String[] args) {
        try{
            throw new Exception("my exception");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
    }
}
