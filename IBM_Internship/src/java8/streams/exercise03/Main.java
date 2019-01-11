package java8.streams.exercise03;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static List<Integer> getFirstNNaturalNumbers(int n) {
        return Stream.generate(new AtomicInteger(0)::getAndIncrement)
                .limit(n)
                .collect(Collectors.toList());
    }

    public static void getAndDisplayFirstNNaturalNumbers2(int n) {
        Stream.generate(new AtomicInteger(0)::getAndIncrement)
                .limit(n)
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        System.out.println(getFirstNNaturalNumbers(10));
        getAndDisplayFirstNNaturalNumbers2(5);
    }
}
