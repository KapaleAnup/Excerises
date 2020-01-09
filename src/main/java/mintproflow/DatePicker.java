package mintproflow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DatePicker {


    WebDriver driver;

    @Test
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://app.mintpro.in");

        driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']")).sendKeys("6999912345");

        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.className("OTPInput")).sendKeys("1234");

        driver.findElement(By.xpath("//button[@class='submitBtn']")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@id='app']/div/div[3]/section/div/div/div/div[3]/div/label/div")).click();

        driver.findElement(By.xpath("//div[@id='app']/div/div[3]/section/div/div/div/div[3]/div/label/div[2]/div[2]/div[3]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@class='defaultReminderH']//span[contains(text(),'Meet Client')]")).click();

        driver.findElement(By.xpath("//i[@class='SmIcon dateTime-picker-sm']")).click();

        driver.findElement(By.xpath("//button[@class='jss413 jss407 jss432 jss434 jss435']")).click();
     //  StringMethods date = driver.findElement(By.xpath("//div[@class='jss311 jss297']//div[4]//div[1]//button[1]")).getText();





    }


    public void selectDatebyJS(WebDriver driver, WebElement element, String dateVal){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value',"+dateVal+"'));",element);
    }
}
