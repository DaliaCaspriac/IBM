package thinkinginjava.errorhandlingwithexceptions.exercise10;

public class Main {
    public static void main(String[] args) {
        Exercise10 ex10 = new Exercise10();
        try{
            ex10.f();
        }catch(MySecondException e){
            System.out.println(e.getMessage());
        }
    }
}
