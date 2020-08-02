package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseController {

    public static WebDriver driver;

    public static Properties prop;

    public static Logger LOG;

    public final static int TIMEOUT = 30;

    public final static int PAGE_LOAD_TIMEOUT = 20;

    public BaseController() {

        prop = new Properties();

        File file = new File("/Users/anupkapale/eclipse-workspace/Excersises/src/main/java/Config/config.properties");
        try {
            FileInputStream inputStream = new FileInputStream(file);
            try {
                prop.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @BeforeClass
    public static void Initialize() {
        LOG = Logger.getLogger("Zoopla");
        PropertyConfigurator.configure("log4j.properties");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get(prop.getProperty("baseUrl"));

        LOG.info("Zoopla Website has been launched, Successfully!!");

        driver.manage().window().maximize();

        LOG.info("Browser has been Maximized.");
    }

    public void Timeouts() {
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    @AfterClass
    public void TearDown() {
        if(driver !=null)
        driver.close();
        LOG.info("Browser Closed.");
    }
}
