package SeleniumCorecomponent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.DriverFactory;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void CreateWebDriver() {

        WebDriverManager.chromedriver().setup();
        this.driver = new FirefoxDriver();

    }
}
