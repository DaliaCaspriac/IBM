package thinkinginjava.containersindepth.exercise40;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.lastname.compareTo(o2.lastname);
    }

}
