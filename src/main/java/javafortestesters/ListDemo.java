package javafortestesters;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    @Test
    public void testArraylistAddAllandSpecificIndex(){

        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Thuesday");

        List<String> missingDays = new ArrayList<>();
        missingDays.add("Wendsday");
        missingDays.add("Thursday");
        missingDays.add("Friday");

        days.addAll(missingDays);
        for (String data:days
             ) {
            System.out.println(data);
        }

    }
}
