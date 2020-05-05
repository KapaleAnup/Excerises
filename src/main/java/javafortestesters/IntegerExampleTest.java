package javafortestesters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerExampleTest {

    @Test
    public void integerExploration() {

        Integer integer = new Integer(4);
        String  value = integer.toString();
        int intvalue =integer.intValue();
        boolean flag = integer.equals(4);
        System.out.println(value);
        System.out.println(intvalue);
        System.out.println(flag);


        String text = new String(" test DELETE");
        String space[] = text.split("%d");
        int size =text.length();
        System.out.println(size);
        String lowerCase = text.toLowerCase();
        System.out.println(lowerCase);

    }



}
