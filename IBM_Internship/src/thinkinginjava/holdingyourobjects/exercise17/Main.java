package thinkinginjava.holdingyourobjects.exercise17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("fuzzy", new Gerbil(3));
        gerbils.put("spot",new Gerbil(5));
        gerbils.put("kiki",new Gerbil(5));
        gerbils.put("lucky",new Gerbil(1));
        Iterator<String> it = gerbils.keySet().iterator();
        while(it.hasNext()){
            String name = it.next();
            System.out.println(name + " hopping " + gerbils.get(name).hop());
        }
    }
}
