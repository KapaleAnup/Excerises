package devqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpResponse;
import org.testng.annotations.Test;

import java.util.List;

public class HttpResponseCode {

        //Check broken links

        WebDriver driver;

        int statusCode;


        @Test
        public void checkBrokerLinks(){

            WebDriverManager.chromedriver().setup();
            driver  = new ChromeDriver();

            driver.get("http://demo.guru99.com/test/newtours/");

            //Get all the links on the page

           List<WebElement> links =  driver.findElements(By.cssSelector("a"));

           String href;

            for (WebElement link: links
                 ) {

              href =  link.getAttribute("href");

             statusCode = new HttpResponse().getStatus();

             if(200 != statusCode){
                 System.out.println(href + " gave a response code of " + statusCode);
             }
                
            }

        }


}
