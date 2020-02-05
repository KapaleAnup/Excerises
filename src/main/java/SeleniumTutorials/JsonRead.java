package SeleniumTutorials;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InputStream;

public class JsonRead {

   protected static WebDriver driver;

   InputStream inputStream ;
   JSONObject loginusers;

   @Test
    public void testData() throws  Exception{

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://practice.automationtesting.in/my-account/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(loginusers.getJSONObject("invalidUser").getString("username"));

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(loginusers.getJSONObject("invalidUser").getString("passwrd"));

        driver.findElement(By.xpath("//input[@name='login']")).click();

       String expectedErormsg = driver.findElement(By.xpath("//strong[contains(text(),'ERROR')]")).getText();


       String actualerrormsg = " Invalid username";

       Assert.assertEquals(expectedErormsg, actualerrormsg);


       try {
           String datapath = "SeleniumTutorials/logindata.json";
           inputStream= getClass().getClassLoader().getResourceAsStream(datapath);
           JSONTokener tokener = new JSONTokener(inputStream);
           loginusers = new JSONObject(tokener);

       }catch (Exception e){
           e.printStackTrace();
       }finally {
           if (inputStream != null) {
               inputStream.close();
           }
       }

    }
}
