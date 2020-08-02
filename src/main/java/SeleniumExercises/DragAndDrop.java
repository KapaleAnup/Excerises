package SeleniumExercises;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//WebDriver driver = new FirefoxDriver();
//        driver.get("http://jqueryui.com/resources/demos/slider/default.html");
//        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
//        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/a"));
//        Actions action = new Actions(driver);
//        action.dragAndDropBy(source, xOffset, yOffset).perform();
public class DragAndDrop {

    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void slide(){
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Horizontal Slider")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider,200,0).perform();

       // Dimension count = driver.findElement(By.xpath("//input[@type='range']")).
      //  System.out.println(count);
       Point result = driver.findElement(By.xpath("//div[@class='sliderContainer']//input")).getLocation();
        System.out.println(result);


    }





    @AfterClass
    public void close(){
        driver.quit();
    }

}
