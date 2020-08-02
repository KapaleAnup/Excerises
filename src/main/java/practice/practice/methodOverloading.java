package practice.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class methodOverloading {



    public static void main(String[] args) {

        WebDriver driver;

        Map<String, String> ma = new HashMap<>();

        ma.put("key1","anup");
        ma.put("key2","anup");
        ma.put("key3","amit");



        for (Map.Entry<String, String > d:ma.entrySet()
             ) {
            System.out.println(d.getKey());
            System.out.println(d.getValue());
        }
    }
}
