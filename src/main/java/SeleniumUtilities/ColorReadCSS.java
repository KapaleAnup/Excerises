package SeleniumUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorReadCSS {

    public static WebDriver driver;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

       driver = new ChromeDriver();

       driver.get("https://www.google.com/");

        WebElement googlelogo = driver.findElement(By.xpath("//img[@alt='Google']"));

        System.out.println("Color of the logo is : " + googlelogo.getCssValue("color"));

        System.out.println("Size of the logo is :" + googlelogo.getCssValue("font-size"));

        System.out.println("Color of the background is :" + googlelogo.getCssValue("background-color"));

        driver.quit();

    }
}
