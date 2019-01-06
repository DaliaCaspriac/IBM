package thinkinginjava.strings.exercise09;

public class Main {
    public static void main(String[] args) {
        String knights = "Then, when you have found the shrubbery, you must "
                + "cut down the mightiest tree in the forest... "
                + "with... a herring! ";
        String regex = "[aeiouAEIOU]";
        System.out.println(knights.replaceAll(regex,"_"));
    }
}
