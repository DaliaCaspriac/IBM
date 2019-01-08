package patricia.errorhandlingwithexceptions;

public interface MyList<T> {
    T get(int index) throws MyException;

    void add(T elem) throws MyException;

    boolean contains(T elem) throws MyException;

    boolean containsAll(T[] elems) throws MyException;

    int size();

    void increaseCapacity();
}
