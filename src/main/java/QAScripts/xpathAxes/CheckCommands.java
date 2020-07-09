package QAScripts.xpathAxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckCommands {

    public static void main(String[] args) {

        WebDriver driver ;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://dbankdemo.com/signup");

        //following xpath -->use the above xpath to get it done.
       // driver.findElement(By.xpath("//input[@id='lastName']//following::input[@type='radio'][1]")).click();

        //Ancestor  -->
//        boolean flag = driver.findElement(By.xpath("//input[@id='firstName']//ancestor::div[2]")).isDisplayed();
//        System.out.println(flag);

        //child
       // driver.findElement(By.xpath("(//div[@class='login-form']//child::input[@type='text'])[1]")).sendKeys("first");

        //Pressiding
       // driver.findElement(By.xpath("//button[@type='submit']//preceding::input[12]")).sendKeys("anup@test.com");

        //following-sibling
        //driver.findElement(By.xpath("//p[text()='Already have account ? ']//following-sibling::a")).click();

        //parent
     //  driver.findElement(By.xpath("//input[@id='firstName']//parent::div")).isDisplayed();

        //descendant
       driver.findElement(By.xpath(" //*[@class='login-form']//descendant::input[@type='text'][2]")).sendKeys("last");




    }
}
