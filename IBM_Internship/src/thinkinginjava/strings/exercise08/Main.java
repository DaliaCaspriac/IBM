package thinkinginjava.strings.exercise08;

public class Main {
    public static void main(String[] args) {
        String knights = "Then, when you have found the shrubbery, you must "
                + "cut down the mightiest tree in the forest... "
                + "with... a herring! ";
        System.out.println(knights.split("the | you").length == 6);
    }
}