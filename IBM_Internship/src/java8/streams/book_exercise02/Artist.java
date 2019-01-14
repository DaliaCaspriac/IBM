package java8.streams.book_exercise02;

public class Artist {
    private String name;
    private int members;

    public Artist(String name, int members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getMembers() {
        return members;
    }
}
