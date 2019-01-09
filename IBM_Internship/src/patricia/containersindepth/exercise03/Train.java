package patricia.containersindepth.exercise03;

import java.util.Objects;

public class Train {
    private String number;
    private String type;
    private int nOWagons;

    public Train(String number, String type, int nOWagons) {
        this.number = number;
        this.type = type;
        this.nOWagons = nOWagons;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", nOWagons=" + nOWagons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Objects.equals(number, train.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, nOWagons);
    }
}
