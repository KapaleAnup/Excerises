package javafortestesters;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class SetInterfaceExamples {

    @Test
    public void setDoesNotAllowDuplicateElements(){
        Set workdays = new HashSet();
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        for (Object days:workdays
             ) {
            System.out.println(days);
        }
        System.out.println(workdays.size());
        assertEquals(1, workdays.size());

    }
}
