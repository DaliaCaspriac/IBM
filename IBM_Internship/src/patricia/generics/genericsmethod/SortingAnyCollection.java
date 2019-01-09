package patricia.generics.genericsmethod;


import java.util.ArrayList;
import java.util.Collection;

public class SortingAnyCollection {
    public static <T extends Comparable<T>> Collection<T> bubbleSortCollection(Collection<T> collection) {
        int n = collection.size();
        ArrayList<T> all = new ArrayList<>();
        all.addAll(collection);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (all.get(j).compareTo(all.get(j + 1)) > 0) {
                    T temp = all.get(j);
                    all.set(j, all.get(j + 1));
                    all.set(j + 1, temp);
                }
            }
        }
        return all;
    }

    public static <T> void printCollection(Collection<T> collection){
        ArrayList<T> all = new ArrayList<>();
        all.addAll(collection);
        for(T elem : all){
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        //Sorting doubles
        Collection<Double> doubles = new ArrayList<>();
        ((ArrayList<Double>) doubles).add(23.4d);
        ((ArrayList<Double>) doubles).add(29.4d);
        ((ArrayList<Double>) doubles).add(2.102d);
        ((ArrayList<Double>) doubles).add(10.238d);
        Collection<Double> sortedDoubles = bubbleSortCollection(doubles);
        printCollection(sortedDoubles);

        System.out.println("--------------------------------------------");

        //Sorting strings
        Collection<String> strings = new ArrayList<>();
        ((ArrayList<String>) strings).add("li");
        ((ArrayList<String>) strings).add("da");
        ((ArrayList<String>) strings).add("a");
        ((ArrayList<String>) strings).add("ta");
        ((ArrayList<String>) strings).add("mi");
        Collection<String> sortedStrings = bubbleSortCollection(strings);
        printCollection(sortedStrings);
    }
}
