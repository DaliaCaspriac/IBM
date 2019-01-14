package java8.streams.exercise05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static Predicate<String> isInteger(){
        return str -> str.matches("[0-9]+");
    }
//    public static Function<Integer, Integer> mySum(Integer i){
//
//    }
    public static int sumIntegers(List<String> string, Predicate<String> predicate){
        return string.stream()
                .filter(predicate)
                .mapToInt(s -> Integer.parseInt(s))
                .sum();
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(new String[]{"da","2","li","3","a","10"}));
        System.out.println(sumIntegers(list,isInteger()));
    }
}
