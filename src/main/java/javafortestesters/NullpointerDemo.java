package javafortestesters;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NullpointerDemo {

    @Test(expectedExceptions = NullPointerException.class)
    public void throwANullPointerException(){
        Integer age = null;

        String ageAsString;

        try {
            ageAsString = age.toString();
        }catch (NullPointerException e){
           // age = 18;
            ageAsString = age.toString();
            e.printStackTrace();
        }


        String yourAge = "You are " + ageAsString + " Years old";
        System.out.println(yourAge);

       // assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void multiException(){
        Integer age=null;
        String ageAsString;
        try{
            ageAsString = age.toString();
        }catch(NullPointerException e){
            age = 18;
            ageAsString = age.toString();
        }catch(IllegalArgumentException e){
            System.out.println("Illegal Argument: " +
                    e.getMessage());
        }
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void nullPointerExceptionExpected(){
        Integer age=null;
        age.toString();
    }
}
