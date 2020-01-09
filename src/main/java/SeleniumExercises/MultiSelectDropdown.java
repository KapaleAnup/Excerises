package SeleniumExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MultiSelectDropdown {


    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void Seleniumtest1() {

        driver.get("http://toolsqa.com/automation-practice-form");

        WebElement command = driver.findElement(By.name("selenium_commands"));
        Select select = new Select(command);

        select.selectByIndex(0);
       // System.out.println( command.getText());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        select.deselectByIndex(0);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        select.selectByVisibleText("Navigation Commands");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        select.deselectByVisibleText("Navigation Commands");


        List<WebElement> listsize =  select.getOptions();
        int sizeoflist = listsize.size();

        for (int i=0;i<sizeoflist;i++){
           String svalue=  listsize.get(i).getText();
            System.out.println(svalue);

            select.deselectByIndex(i);

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        select.deselectAll();



    }


    @AfterClass
    public void close(){
        driver.quit();
    }


}
