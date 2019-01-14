package java8.streams.book_exercise04;

import java.util.*;

public class Main {
    public static int countLowercaseLetters(String s) {
        return (int) s.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isLowerCase)
                .count();
    }

    public static Optional<String> getLargestLowercaseString(List<String> list) {
        return list.stream()
                .max(Comparator.comparing(Main::countLowercaseLetters));
    }


    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.addAll(Arrays.asList(new String[]{"daLIA", "DaLiA", "Daalliiaa", "dalia", "daliaaA"}));

        System.out.println(getLargestLowercaseString(strs).get());
    }
}
