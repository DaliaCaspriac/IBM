package thinkinginjava.holdingyourobjects.exercise12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> one = new ArrayList<>(5);
        one.add(10);
        one.add(20);
        one.add(30);
        one.add(40);
        one.add(50);
        List<Integer> two = new ArrayList<>(5);
        ListIterator<Integer> iterator = one.listIterator();
        while(iterator.hasNext()){iterator.next();}
        while(iterator.hasPrevious()){
            two.add(iterator.previous());
        }
        for(Integer integer : two){
            System.out.print(integer + ", ");
        }

    }
}
