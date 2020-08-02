package FakeDataGeneration;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class FakeData {

    //Generate random values.
    @Test
    public static void email() {
        String generatestring = RandomStringUtils.randomAlphabetic(8);
        System.out.println(generatestring + "@test.com");


    }

    @Test(successPercentage = 50)
    public void getrandomPhoneNumber() {


        String phonenumber = RandomStringUtils.randomNumeric(9);
        System.out.println("1"+phonenumber);
    }

    @Test
    public void getName(){
     String name =   RandomStringUtils.randomAlphabetic(6);
        System.out.println(name);

    }
}
