package vinsguru.TestNgFramework;

import SeleniumCorecomponent.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    private WebDriver driver;

    @BeforeTest

    public void setUpDriver(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();



    }


}
