package patricia.containersindepth.exercise01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Romania", "Bucuresti"));
        countries.add(new Country("Ucraina", "Kiev"));
        countries.add(new Country("Ungaria", "Budapesta"));
        countries.add(new Country("Republica Moldova","Chisinau"));
        countries.add(new Country("Bulgaria", "Sofia"));
        Collections.sort(countries);
        for(Country c : countries){
            System.out.println(c.toString());
        }
    }
}
