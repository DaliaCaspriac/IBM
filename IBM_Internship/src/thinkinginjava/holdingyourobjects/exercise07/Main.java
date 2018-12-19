package thinkinginjava.holdingyourobjects.exercise07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = new Pet[10];
        for(int i = 0 ;i < 10; i++){
            pets[i] = new Pet(i, "pet"+i);
        }
        List<Pet> petList = new ArrayList<>(Arrays.asList(pets));
        System.out.println(petList.size());
        List<Pet> petSubList = petList.subList(3,7);
        System.out.println(petSubList.size());
        petList.removeAll(petSubList);
        System.out.println(petList.size());
    }
}
