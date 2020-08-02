package java8basics;

import java.util.function.Function;

public class FunctionBasics {


    public static void main(String[] args) {

        Function<String, Integer> function = x -> x.length();

       int length = function.apply("T.");

        System.out.println(length);

        //Chaining function

        Function <Integer, Integer> function1 = x -> x * 2;

        int result = function.andThen(function1).apply(" this is anup here");

        System.out.println(result);
    }
}
