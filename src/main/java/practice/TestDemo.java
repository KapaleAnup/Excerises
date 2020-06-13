package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestDemo {

    private WebDriver driver;

    @Test
    public void tetst() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.sangam.com/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//div[@class='Mt(20px)--s Mt(20px)--D']//div//div[@class='Pos(r) soft-half-h--ends Cur(p) txt-g-primary']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='custom-input']")).sendKeys("Hindu - karmakar");


        List<WebElement> listoflanguages = driver.findElements(By.xpath("//div[@class='Mt(58px)']//div"));

        System.out.println(listoflanguages.size());

        for(int i=0;i<listoflanguages.size();i++){
            String language = listoflanguages.get(i).getText();
            System.out.println(language);
            listoflanguages.get(i).click();

        }












//        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'MuiInputBase-root-211')]"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", element);



//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys("00000000");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys(Keys.COMMAND+ "a" +Keys.BACK_SPACE);
//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys(Keys.BACK_SPACE);
//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys(Keys.BACK_SPACE);
//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys(Keys.BACK_SPACE);
//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys(Keys.BACK_SPACE);
//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys(Keys.BACK_SPACE);
//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys(Keys.BACK_SPACE);
//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys(Keys.BACK_SPACE);

//        driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys("08121993");





//        driver.findElement(By.xpath("//div[@class='Mt(20px)--s Mt(20px)--D']//div//div[@class='Pos(r) soft-half-h--ends Cur(p) txt-g-primary']")).click();
//        driver.findElement(By.xpath("//input[@placeholder='Search Mother Tongue']")).sendKeys("English");
//        driver.findElement(By.xpath("//div[contains(text(),'English')]")).click();

//        driver.findElement(By.xpath("//div[@class='push--top']//div//div[@class='Pos(r) soft-half-h--ends Cur(p) txt-g-primary']")).click();
//
//        driver.findElement(By.xpath("//input[@type='custom-input']")).sendKeys("Hindu - kunbi");
//        driver.findElement(By.xpath("//div[contains(text(),'Hindu - Kunbi')]")).click();

  //      driver.findElement(By.xpath("//input[@class='mskd-inpt  ']")).sendKeys("08121989");

//      List<WebElement> list =  driver.findElements(By.xpath("//span[@class='MuiButton-label-593']"));
//
//         System.out.println("list size:" + list.size());
//
//        for (int i=0 ;i<list.size();i++){
//            System.out.println(list.get(i).getText());
//            if (list.get(i).getText().contains("Hindu - Kunbi")){
//                list.get(i).click();
//                break;
//            }
//        }



















//        WebElement element1 = driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-5']//div[@select='true']"));
//        element1.click();
//
//        WebElement clickelement = driver.findElement(By.xpath("//ul[@role='listbox']"));
//        //Select select = new Select(driver.findElement(By.xpath("//ul[@role='listbox']")));
//
//        Select select = new Select(element);
//
//        List originalist = new ArrayList();
//
//        List<WebElement> options = select.getOptions();
//
//        for (WebElement e : options
//                ) {
//            originalist.add(e.getText());
//        }
//        System.out.println(originalist);
//
   }
}
