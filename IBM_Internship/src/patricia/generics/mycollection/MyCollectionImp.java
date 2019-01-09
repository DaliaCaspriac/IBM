package patricia.generics.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionImp<T> implements MyCollection<T> {
    private ArrayList<T> array;

    public MyCollectionImp(){
        this.array = new ArrayList<>();
    }

    @Override
    public boolean containsAll(Collection<T> collection) {
        for(T elem : collection){
            if(!array.contains(elem)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<T> collection) {
        array.addAll(collection);
        return true;
    }
}
