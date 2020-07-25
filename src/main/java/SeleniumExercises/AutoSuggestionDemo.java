package SeleniumExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class AutoSuggestionDemo {


    WebDriver driver;
    @Test
    public void autoSuggestSelection(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> searchList = driver.findElements(By.xpath("//ul//li//div[@class='sbtc']"));

        for(int i=0;i<searchList.size();i++){

            System.out.println(searchList.get(i).getText());

            String search = searchList.get(i).getText();

            if(search.equalsIgnoreCase("Selenium testing")){
                searchList.get(i).click();
               break;

            }
        }


        driver.close();
    }


}
