package patricia.generics.mycollection;

import java.util.Collection;

public interface MyCollection<T> {
    boolean containsAll(Collection<T> collection);

    boolean addAll(Collection<T> collection);
}
