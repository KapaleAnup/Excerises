package javafortestesters;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class CollectionsExamples {



    @Test
    public void itertateThroughForEach(){
        /**
         * And we will see the different approaches I take for finding the position of "Monday" in the
         * List.
         * With the for each loop, I can iterate over every element in the List and when I find
         * "Monday" I will have to break out of the loop.
         */
        String [] someDays = {"Tuesday","Thursday",
                "Wednesday","Monday",
                "Saturday","Sunday",
                "Friday"};

        List<String> days = Arrays.asList(someDays);
        int forcount =0;
        for (String day: days
             ) {
            if(day.equals("Monday"));
            break;
        }
        forcount++;



    }

    @Test
    public void itertateThroughForLoop(){
        String [] someDays = {"Tuesday","Thursday",
                "Wednesday","Monday",
                "Saturday","Sunday",
                "Friday"};
        List<String> days = Arrays.asList(someDays);
        int loopCount ;
        for (loopCount =0;loopCount<=days.size();loopCount++){
            if(days.get(loopCount).equals("Monday")){
                break;
            }

        }

        Assert.assertEquals( 3, loopCount,"Monday is at position 3");
        System.out.println(days);
    }

    @Test
    public void itertateThroughWhileLoop(){

        String [] someDays = {"Tuesday","Thursday",
                "Wednesday","Monday",
                "Saturday","Sunday",
                "Friday"};
        List<String> days = Arrays.asList(someDays);

        int count =0 ;
        while (!days.get(count).equals("Monday")){
            count++;
        }

        Assert.assertEquals(3, count,"Monday is at position 3");

    }
}
