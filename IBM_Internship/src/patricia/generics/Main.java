package patricia.generics;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        //1
        MyCollectionImp<String> myColl = new MyCollectionImp<>();
        Collection<String> coll = new ArrayList<>();
        ((ArrayList<String>) coll).add("da");
        ((ArrayList<String>) coll).add("li");
        ((ArrayList<String>) coll).add("a");
        Collection<String> coll2 = new ArrayList<>();
        ((ArrayList<String>) coll2).add("dalia");
        myColl.addAll(coll);
        myColl.addAll(coll2);
        System.out.println(myColl.containsAll(coll2));
        //2
        MyCollectionImp<Double> myColl2 = new MyCollectionImp<>();
        Collection<Double> coll3 = new ArrayList<>();
        ((ArrayList<Double>) coll3).add(10.4d);
        ((ArrayList<Double>) coll3).add(13.349d);
        ((ArrayList<Double>) coll3).add(9d);
        Collection<Double> coll4 = new ArrayList<>();
        ((ArrayList<Double>) coll4).add(11d);
        myColl2.addAll(coll3);
        System.out.println(myColl2.containsAll(coll3));
        System.out.println(myColl2.containsAll(coll4));
        myColl2.addAll(coll4);
        System.out.println(myColl2.containsAll(coll4));
    }
}