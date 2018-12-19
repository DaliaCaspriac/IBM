package thinkinginjava.errorhandlingwithexceptions.exercise03;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"da","li","a"};
        try {
            System.out.println(strings[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
