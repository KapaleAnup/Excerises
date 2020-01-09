package SeleniumCorecomponent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void CreateWebDriver() {

        WebDriverManager.chromedriver().setup();
        this.driver = new FirefoxDriver();
    }
}
