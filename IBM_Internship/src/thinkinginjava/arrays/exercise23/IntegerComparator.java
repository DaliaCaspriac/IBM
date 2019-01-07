package thinkinginjava.arrays.exercise23;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1.intValue() > o2.intValue() ? -1 : (o1.intValue() == o2.intValue() ? 0 : 1));
    }
}
