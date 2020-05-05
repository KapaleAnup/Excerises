package devqa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTwoLists {

    public static void main(String[] args) {

        List<String> listone = Arrays.asList("a", "b", "c");
        List<String> listTwo = Arrays.asList("c", "a", "b");
        List<String> listThree = Arrays.asList("a", "b", "c");

        boolean isEqual = listone.equals(listTwo);
        System.out.println(isEqual);

        isEqual = listone.equals(listThree);
        System.out.println(isEqual);


        Collections.sort(listone);
        Collections.sort(listTwo);
        Collections.sort(listThree);

        boolean isEqual1 = listone.equals(listTwo);
        System.out.println(isEqual1);

        isEqual1 = listone.equals(listThree);
        System.out.println(isEqual1);

    }
}
