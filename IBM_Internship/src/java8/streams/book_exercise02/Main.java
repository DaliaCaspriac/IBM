package java8.streams.book_exercise02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int totalMembers(List<Artist> artistList) {
        return artistList.stream()
                .mapToInt(Artist::getMembers)
                .sum();
    }

    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();
        artists.addAll(Arrays.asList(new Artist[]{new Artist("art1", 10), new Artist("art2", 1)}));
        System.out.println(totalMembers(artists));
//        Artist a = new Artist("a",12);
//        Artist b = new Artist("b",8);

    }
}
