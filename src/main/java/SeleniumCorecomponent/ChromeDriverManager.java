package SeleniumCorecomponent;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {
    @Override
    public void CreateWebDriver() {

        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();

    }
}
