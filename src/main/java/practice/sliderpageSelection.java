package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class sliderpageSelection {


    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://app.mintpro.in/signup");

      //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       driver.findElement(By.xpath("//div[@class='slick-slide slick-active slick-current' and @aria-hidden='false']")).click();

        System.out.println("Button selected...");



    }
}
