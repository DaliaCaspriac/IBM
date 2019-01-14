package java8.streams.book_exercise03;

public class Main {

    public static long countLowercaseLetters(String s) {
        return s.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isLowerCase)
                .count();
    }

    public static void main(String[] args) {
        String str = "aBbcDdeFGh";
        System.out.println(countLowercaseLetters(str));
    }
}
