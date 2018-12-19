package thinkinginjava.holdingyourobjects.exercise07;

public class Pet {
    private int id;
    private String name;

    public Pet(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
