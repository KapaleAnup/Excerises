package javafortestesters;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ArraysTest {

    @Test
    public void simpleArrayExample(){

        String[] numbers0123 = {"zero", "one", "two","three"};

        for (int i=0;i<numbers0123.length;i++){
            System.out.println(numbers0123[i]);
        }

        System.out.println("***********");
        for (String numbertext: numbers0123
             ) {
            System.out.println("length: "+numbertext);
        }
        System.out.println(numbers0123.length);
        Assert.assertEquals("zero", numbers0123[0]);
        Assert.assertEquals("two", numbers0123[2]);
    }


    @Test
    public void daysOfWork(){

        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};

        workdays = Arrays.copyOf(workdays,7);
        workdays = Arrays.copyOfRange(workdays,2,5);

        for (int i = 0;i<workdays.length;i++){
            System.out.println(workdays[i]);
        }

        System.out.println("*******");
        String days = "";
        for (String workday: workdays
             ) {

           days = days + " | " +workday;
            System.out.println(days);
        }


    }

    @Test
    public void forLoopUsingIndexFixedCondition(){

        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};
        String days ="";
        for (int i=0;i<days.length();i++){
            days = days + " | "+ i+ " - " + workdays[i];

            System.out.println(days);
        }
    }

    @Test
    public void fillMethod(){
        int[] minusOne = new int[30];
        Arrays.fill(minusOne,-1);
        for (int i=0;i<minusOne.length;i++){
            System.out.println(minusOne.length);
            System.out.println(minusOne[i]);
        }



    }

        @Test
        public void fillMethod1(){

            int[] tenItems= {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};

            Arrays.fill(tenItems,5, 10, 2);

            for (int newItems: tenItems
                 ) {
                System.out.println(newItems);
            }

            for (int i=0;i<tenItems.length;i++){
                System.out.println(tenItems[i]);
            }
        }

        @Test
        public void sortMethod(){
            int[] outOfOrder = {2,4,3,1,5,0};
            Arrays.sort(outOfOrder);
            System.out.println(outOfOrder.getClass().getName());
            for (int i =0;i<outOfOrder.length;i++){
                System.out.println(outOfOrder[i]);
            }
        }

    @Test
    public void sortMethodByStrings(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Arrays.sort(workdays);
        for (int i=0;i<workdays.length;i++){
            System.out.println(workdays[i]);
        }
    }
    @Test
    public void sortMethodByStringsWithLoweCase(){
        String[] workdays = {"monday", "tuesday", "wednesday", "thursday", "friday"};

        Arrays.sort(workdays);
        for (int i=0;i<workdays.length;i++){
            System.out.println(workdays[i]);
        }
        Assert.assertEquals("friday",workdays[0]);
    }

    @Test
    public void sortResults(){
        sortMethodByStrings();

        sortMethodByStringsWithLoweCase();

    }
    }

