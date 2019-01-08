package thinkinginjava.containersindepth.exercise40;

public class Person implements Comparable<Person>{
    protected String firstname;
    protected String lastname;

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public int compareTo(Person o) {
        return this.firstname.compareTo(o.firstname);
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}

