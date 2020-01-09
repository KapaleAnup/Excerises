package SeleniumExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DynamicWebTables {

    private WebDriver driver;

    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        driver = new ChromeDriver(options);
    }

    @Test
    public void dynamicWebtablesHandle(){

        String sRow = "1";
        String sColoumn = "2";

        driver.get("http://toolsqa.com/automation-practice-table");

        String data= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+sRow+"]/td["+sColoumn+"]")).getText();

        System.out.println(data);
        String sRowValue = "Clock Tower Hotel";

        for (int i=1;i<=5;i++){
            String svalue= null;
            svalue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();

            if(svalue.equalsIgnoreCase(sRowValue)){

                for (int j=1;j<=5;j++){
                    String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
                    System.out.println(sColumnValue);
                }
            }
            break;
        }

    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}
