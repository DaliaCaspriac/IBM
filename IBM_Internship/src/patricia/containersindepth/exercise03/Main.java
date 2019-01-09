package patricia.containersindepth.exercise03;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Train> set = new HashSet<>();
        set.add(new Train("AB1234","type1",10));
        set.add(new Train("AB1234","type1",10));
        set.add(new Train("DF9832","type3",5));
        set.add(new Train("DF9833","type3",5));
        set.add(new Train("VR0000","type1",11));
        set.add(new Train("TG1010","type2",1));
        for(Train train : set){
            System.out.println(train.toString());
        }
    }
}
