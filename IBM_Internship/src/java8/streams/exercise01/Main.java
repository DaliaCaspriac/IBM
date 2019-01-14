package java8.streams.exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static Predicate<String> isStringEqualsWith(String str) {
        return p -> p.equals(str);
    }

    public static long countOccurencesOfAString(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate).count();
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList(new String[]{"da", "li", "a", "da", "x", "da", "li", "da", "no"}));
        System.out.println(countOccurencesOfAString(strings, isStringEqualsWith("da")));
    }
}
