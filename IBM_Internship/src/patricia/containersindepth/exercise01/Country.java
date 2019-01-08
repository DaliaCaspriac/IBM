package patricia.containersindepth.exercise01;

public class Country implements Comparable<Country> {
    private String name;
    private String capital;

    public Country(String name, String capital){
        this.name = name;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }

    @Override
    public int compareTo(Country o) {
        return this.name.compareTo(o.name);
    }
}
