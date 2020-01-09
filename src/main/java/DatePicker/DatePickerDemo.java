package DatePicker;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

    static WebDriver driver;
    public static void main (String args[]) {

        String month = "July 2019";

        String day = "21";

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.phptravels.net/");

        driver.findElement(By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']")).click();

        while (true) {
            String text = driver.findElement(By.xpath("//div[10]//div[1]//tr[1]//th[2]")).getText();

            if (text.equals(month)){
                break;
            }
            else
            {
                driver.findElement(By.xpath("//div[10]//div[1]//tr[1]//th[3]")).click();
            }

            driver.findElement(By.xpath("//div[10]//tr//td[contains(text(),"+day+")]")).click();
        }
    }
}
