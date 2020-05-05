package devqa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayListUsingLambda {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 4, 3 );

        System.out.println(numbers);

        List<Integer> removeDuplicates = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(removeDuplicates);
    }
}
