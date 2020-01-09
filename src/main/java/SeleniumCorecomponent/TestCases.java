package SeleniumCorecomponent;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

    DriverManager driverManager;
    WebDriver driver;


    @Test
    public void navigateToGoogleTest(){
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        //driverManager = driverManager.getWebDriver();
        driver.get("https://www.google.com");
        Assert.assertEquals("Google",driver.getTitle());
    }


}
