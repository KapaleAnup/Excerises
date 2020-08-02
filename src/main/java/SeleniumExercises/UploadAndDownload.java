package SeleniumExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UploadAndDownload {

    WebDriver driver;

    @Test
    public void donwloadFile(){


        String downloadPath = "src/main/resources";


        Map<String, Object> chromePref = new HashMap<>();
        chromePref.put("profile.default_content_settings.popups", 0);
        chromePref.put("download.default.directory", downloadPath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs",chromePref);
        options.addArguments("--test-type");
        options.addArguments("--disable-extensions");
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);


        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver(options);

        driver.get("https://www.selenium.dev/downloads/");

        driver.findElement(By.linkText("4.0.0-alpha-6")).click();

        System.out.println("Downloaded the file");




    }
}
