package java8.streams.exercise02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static List<Integer> getFirstNNaturalNumbers(int n) {
        return Stream.iterate(0, x -> x + 1).limit(n).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> ints = getFirstNNaturalNumbers(15);
        System.out.println(ints);
    }
}
