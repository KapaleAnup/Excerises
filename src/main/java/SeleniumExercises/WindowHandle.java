package SeleniumExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {



    WebDriver driver;
    @Test
    public void handleWindow() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");

       String parrentWindID =  driver.getWindowHandle();
        System.out.println("Parent id :" + parrentWindID);

        driver.findElement(By.id("windowhandling1")).click();

        Set<String > allwindId = driver.getWindowHandles();

        System.out.println("All window ids are : ");
        for (String  allids:allwindId
             ) {
            System.out.println(allids);
        }


        Iterator<String> iterator=  allwindId.iterator();
        while (iterator.hasNext()){
            String childwind = iterator.next();
            if (!parrentWindID.equalsIgnoreCase(childwind)){
                driver.switchTo().window(childwind);
                System.out.println("Child url is :"+ driver.getCurrentUrl());
                System.out.println("Child Window title is  :"+ driver.getTitle());

                driver.findElement(By.id("searchInput")).sendKeys("Selenium Tutorial");
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                driver.close();
            }
        }

        driver.switchTo().window(parrentWindID);
        driver.quit();
    }


}
