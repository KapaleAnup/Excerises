package practice.practice5;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringWithLambdaAndStreamApi {


        @Test
        public void forEeachMethod(){
            List<String> fruits = new ArrayList<>();
            fruits.add("Banana");
            fruits.add("Apple");
            fruits.add("Orrange");
            fruits.add("Mango");
            fruits.add("Pear");

            fruits.forEach(str -> System.out.println(str));
           long countte =  fruits.stream().filter(count-> count.length() <6).count();
            System.out.println(countte);

            
        }

        @Test
    public void functionalInterface(){




        }





}
