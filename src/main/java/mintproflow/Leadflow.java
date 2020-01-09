package mintproflow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Leadflow {

    WebDriver driver;

    @Test
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://app.thanos.stage.mintpro.in");

        driver.findElement(By.xpath("//input[@placeholder='Enter Your Mobile Number']")).sendKeys("6999912345");

        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.className("OTPInput")).sendKeys("1234");

        driver.findElement(By.xpath("//button[@class='submitBtn']")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

      //  driver.findElement(By.xpath("//label[@class='customChkRadioBtn'][@for='unread']//span[contains(text(),'Unread')]")).click();

         // driver.findElement(By.xpath("//label[@class='customChkRadioBtn']//span[contains(text(),'Unread')]")).click();

          //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         // driver.findElement(By.xpath("//label[@class='customChkRadioBtn']//span[contains(text(),'Renewals Due')]")).click();

         // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         // driver.findElement(By.xpath("//label[@class='customChkRadioBtn']//span[contains(text(),'Reminders')]")).click();

           // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

          // driver.findElement(By.xpath("//label[@class='customChkRadioBtn']//span[contains(text(),'Show All')]")).click();

//        List<WebElement> leads = driver.findElements(By.xpath("//div[@class='expandLead']"));
//        System.out.println(leads.size());
//
//         for(int i=0;i<leads.size();i++) {
//             System.out.println(leads.get(0).getText());
//             leads.get(0).click();
//         }

         // //div[@class='verticalIcon']

     /*   WebDriverWait wait= new WebDriverWait(driver,15);*/
     /* //  WebElement test;*/
    //    test = wait.until(ExpectedConditions.visibilityOf(leads));



     String vicon= driver.findElement(By.xpath("//div[@class='verticalIcon']"))    .getText();

              System.out.println("icon verifed"+ vicon);       


      WebElement leadcard=  driver.findElement(By.xpath("//div[@class='collapseLead']"));
        WebDriverWait wait= new WebDriverWait(driver,15);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       wait.until(ExpectedConditions.visibilityOf(leadcard)).click();
       System.out.println("sfffsfsdfsd");

     WebElement remidner= driver.findElement(By.xpath("//div[@class='jss146 jss185 jss199 jss209 jss223']//div[1]//label[1]//div[2]//div[2]//div[4]"));
     wait.until(ExpectedConditions.elementToBeClickable(remidner)).isDisplayed();

      System.out.println("done , it's displayed...");

    //driver.findElement(By.xpath("//body/div[@id='app']/div[@class='mintpro-wrapper']/div[@class='mintproContainer']/section[@class='style__DashboardContainer-l65fe8-0 bmvMAE']/div[@class='container']/div[@class='jss276 jss300 leadContainer']/div[@class='jss277 jss316 jss330 jss340 jss354']/div[@class='jss277 jss316 tabData']/div/div[1]/div[1]/label[1]/div[1]")).click();

        driver.close();

    }
}
