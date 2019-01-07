package thinkinginjava.arrays.exercise21;

import java.util.Comparator;

public class CompBerylliumSphereComparator implements Comparator<CompBerylliumSphere> {

    @Override
    public int compare(CompBerylliumSphere o1, CompBerylliumSphere o2) {
        return (o1.id > o2.id ? -1 : (o1.id == o2.id ? 0 : 1));
    }
}
