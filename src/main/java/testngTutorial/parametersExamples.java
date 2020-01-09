package testngTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersExamples {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String URL) {

        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

            driver = new ChromeDriver();
        }
       else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/anupkapale/Downloads/chromedriver");

            driver = new FirefoxDriver();
        }

        driver.get(URL);
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
