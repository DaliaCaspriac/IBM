package thinkinginjava.holdingyourobjects.exercise04;

import java.util.*;

public class CharacterNamesGenerator {
    private int index = 0;

    public String next() {
        switch (index) {
            default:
            case 0:
                index++;
                return "Snow White";
            case 1:
                index++;
                return "Sleeping beauty";
            case 2:
                index++;
                return "Cindrella";
            case 3:
                index++;
                return "Bella";
            case 4:
                index++;
                return "Aladin";
            case 5:
                index = 0;
                return "Ariel";

        }
    }

    public Collection fill(Collection<String> myColl, int size){
        for(int i = 0; i < size; i++){
            myColl.add(next());
        }
        return myColl;
    }

    public static void main(String[] args) {
        CharacterNamesGenerator generator = new CharacterNamesGenerator();
        System.out.println(generator.fill(new ArrayList<>(),10));
        System.out.println(generator.fill(new LinkedList<>(),10));
        System.out.println(generator.fill(new HashSet<>(),10));
        System.out.println(generator.fill(new LinkedHashSet<>(),10));
        System.out.println(generator.fill(new TreeSet<>(),10));
    }
}