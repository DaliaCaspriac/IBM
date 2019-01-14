package java8.streams.book_exercise02;

import java.util.List;

public class Artists {
    private String name;
    private List<Artist> members;

    public Artists(String name, List<Artist> members){
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public List<Artist> getMembers() {
        return members;
    }
}
