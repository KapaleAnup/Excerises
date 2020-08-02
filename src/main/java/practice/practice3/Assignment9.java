package practice.practice3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Assignment9 {


    public static double convertToKg(double pound){

        double result = pound * 0.45359237;

        BigDecimal bigDecimal = BigDecimal.valueOf(result);

        bigDecimal.setScale(3, RoundingMode.HALF_UP);

        return bigDecimal.doubleValue();
    }

   @Test
    public void test1(){
       Assert.assertEquals(convertToKg(100),45.359,0.01);
    }
    @Test
    public void test2(){
        Assert.assertEquals(convertToKg(100),45.359,0.001);
    }

    @Test
    public void test3(){
        Assert.assertEquals(convertToKg(100),45.35,0.01);
    }

    @Test
    public void test4(){
        Assert.assertEquals(convertToKg(100),45.35,0.001);
    }
}
