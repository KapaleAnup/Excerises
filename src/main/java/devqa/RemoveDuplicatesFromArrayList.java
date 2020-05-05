package devqa;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {

        ArrayList<String> pets = new ArrayList<>();
        pets.add("cat");
        pets.add("dog");
        pets.add("cat");
        pets.add("hamster");

        System.out.println(pets);

        Set<String> hashset = new LinkedHashSet<>(pets);

        ArrayList<String> removeDuplicates = new ArrayList<>(hashset);

        System.out.println(removeDuplicates);

    }
}
