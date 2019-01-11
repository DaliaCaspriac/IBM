package java8.streams.exercise04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static Function<String, String> concat(String str){
        return x -> x.concat(str);
    }
    public static List<String> mapcar(List<String> list,Function<String, String> function){
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList(new String[]{"d","a","l","i","a"}));
        System.out.println(mapcar(strings,concat("*")));
    }
}
