package devqa;

import java.util.*;

public class RemoveDuplicatesIntegersFromArrayList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 4, 4, 4, 3, 5, 7, 8);
        System.out.println(numbers.size());

        System.out.println(numbers);

        Set<Integer> hashset = new LinkedHashSet<>(numbers);
        ArrayList<Integer> removeDuplicateIntegers = new ArrayList<>(hashset);
        System.out.println(removeDuplicateIntegers.size());

        System.out.println(removeDuplicateIntegers);

    }
}
