package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class test {


    WebDriver driver;

    @Test
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        @FindBy(xpath = "//a[@class='carousel-control-next']//span[@class='sr-only']")
//        private List<WebElement> crousalIcon;

        WebElement nextButton = driver.findElement(By.xpath("//a[@class='carousel-control-next' and @data-slide='next']"));
        if(nextButton.isDisplayed()){
            List<WebElement> crousalIcon =  driver.findElements(By.xpath("//a[@class='carousel-control-next' and @data-slide='next']"));


            int count =0;
            for (int i = 0; i < crousalIcon.size(); i++) {
                crousalIcon.get(i).click();
                count++;
            }
            System.out.println(crousalIcon.size());

        }
        System.out.println("all banner selected");
    }
}
