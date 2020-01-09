package testngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExamples {

    WebDriver driver;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 0)
    void logo() {

        WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));

        Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed.");
    }

    @Test(priority = 1)
    void HomepageTitle(){

      String title=   driver.getTitle();

      Assert.assertEquals("OrangeHRM",title,"Title is not matched.");
    }

    @AfterClass
    void TearDown(){
        driver.quit();
    }
}
