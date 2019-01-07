package thinkinginjava.arrays.exercise21;

import thinkinginjava.arrays.exercise02.BerylliumSphere;

public class CompBerylliumSphere implements Comparable<CompBerylliumSphere> {
    private static long count;
    protected final long id = count++;

    @Override
    public String toString() {
        return "CompBerylliumSphere{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(CompBerylliumSphere o) {
        return this.id < o.id ? -1 : (this.id == o.id ? 0 : 1);
    }
}
