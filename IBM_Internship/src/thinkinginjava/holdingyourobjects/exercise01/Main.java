package thinkinginjava.holdingyourobjects.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(4));
        gerbils.add(new Gerbil(3));
        gerbils.add(new Gerbil(5));
        for(int i  = 0; i < gerbils.size(); i++){

            System.out.println(gerbils.get(i).hop());
        }
    }
}