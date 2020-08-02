package practice.practice4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

    public class Test {

        private WebDriver driver;
        // private WebDriverWait wait;
        WebDriverWait wait=new WebDriverWait(driver, 20);

        @org.testng.annotations.Test
        public void tetst(){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.get("https://www.sangam.com/");

            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);



            WebElement element = driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-5']//div[@select='true']"));

            Select select = new Select(element);

            List originalist = new ArrayList();

            List<WebElement> options = select.getOptions();

            for (WebElement e: options
                    ) {
                originalist.add(e.getText());
            }
            System.out.println(originalist);


            //Select select = new Select(driver.findElement(By.xpath("//ul[@role='listbox']")));
            select.selectByIndex(1);

//       WebElement langselection=  driver.findElement(By.xpath("//div[@class='Mt(20px)--s Mt(20px)--D']//div//div[@class='Pos(r) soft-half-h--ends Cur(p) txt-g-primary']"));
//      // langselection.clear();
//       langselection.click();
//
//       driver.findElement(By.xpath("//input[@placeholder='Search Mother Tongue']")).sendKeys("English");
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
//       driver.findElement(By.xpath("//div[contains(text(),'English')]")).click();

            //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//input[@id='dob-input']")).sendKeys("0");
//        driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-5']//div[2]//input[1]")).sendKeys("8");
//        driver.findElement(By.xpath("//body//div[@class='main-content']//div//div[3]//input[1]")).sendKeys("0");
//        driver.findElement(By.xpath("//div[4]//input[1]")).sendKeys("2");
//        driver.findElement(By.xpath("//div[5]//input[1]")).sendKeys("1");
//        driver.findElement(By.xpath("//div[6]//input[1]")).sendKeys("9");
//        driver.findElement(By.xpath("//div[7]//input[1]")).sendKeys("8");
//        driver.findElement(By.xpath("//div[8]//input[1]")).sendKeys("8");



//        driver.findElement(By.xpath("//input[@id='dob-input']//div[@class='col-xs-12 col-md-5']//div[2]//input[1]//body//div[@class='main-content']//div//div[3]//input[1]" +
//                "//div[4]//input[1]//div[5]//input[1]//div[6]//input[1]//div[7]//input[1]//div[8]//input[1]"))
//                .sendKeys("08121989");

             driver.findElement(By.xpath("//div[@class='push--top']//div//div[@class='Pos(r) soft-half-h--ends Cur(p) txt-g-primary']")).click();


            driver.findElement(By.xpath("//span[@class='txt-g-tertiary']")).sendKeys("Hindu - kunbi");
            driver.findElement(By.xpath("//div[contains(text(),'Hindu - Kunbi')]")).click();

            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);



        }
    }


