package java8.streams.book_exercise01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static int addUp(Stream<Integer> numbers){
        //return numbers.reduce(0,(a,b)->a+b); //correct
        //return numbers.reduce(0,Integer::sum);  //correct
        return numbers.mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(new Integer[]{10,20,30,40,50}));
        System.out.println(addUp(numbers.stream()));
    }
}
