package thinkinginjava.arrays.exercise19;

public class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        if (other.getId() == this.getId())
            return true;
        return false;
    }
}
