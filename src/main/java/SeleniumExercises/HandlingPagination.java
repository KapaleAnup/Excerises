package SeleniumExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandlingPagination {

    WebDriver driver;

    @Test
    public void HabdlePage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://datatables.net/examples/advanced_init/dt_events");

        List<WebElement> namselist = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));

        List<String> names = new ArrayList<String>();

        for (WebElement namselists:namselist
             ) {
            names.add(namselists.getText());
        }

      String nextbutton=  driver.findElement(By.id("example_next")).getAttribute("class");

        while (!nextbutton.contains("disabled")){
            driver.findElement(By.id("example_next")).click();
            namselist = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));

            for (WebElement namselists:namselist
                    ) {
                names.add(namselists.getText());
            }

            nextbutton=  driver.findElement(By.id("example_next")).getAttribute("class"); driver.findElement(By.id("example_next")).getAttribute("class");
        }

        for (String name: names
             ) {
            System.out.println(name);
            
        }
        int totalnoofnames = names.size();
        System.out.println("Total no of names is : " + totalnoofnames);

      String displayCount=   driver.findElement(By.id("example_info")).getText().split(" ")[5];
        System.out.println("Display count is : " + displayCount);

        Assert.assertEquals(displayCount,String.valueOf(totalnoofnames));

        Thread.sleep(5000);
        driver.close();

    }
}
