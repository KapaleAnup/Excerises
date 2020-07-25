package SeleniumExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePicker {




    WebDriver driver;
    @BeforeMethod
    public void handleDatePicker() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
    }


    @Test
    private void datePicker(){

        String month = "July 2019";
        String day = "08";

        driver.findElement(By.xpath("//*[@id=\"sandbox-container1\"]//input")).click();

        while(true){
            //html/body/div[3]/div[1]/table/thead/tr[2]/th[2]

            String monthData = driver.findElement(By.xpath("(//tr//th[@class='datepicker-switch'])[1]")).getText();
          //  System.out.println(monthData);

            if(monthData.equals(month)){
                break;
            }else {

                driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[1]")).click();
            }
        }

        driver.findElement(By.xpath("//tr/td[contains(text(),"+day+")]"));

    }
}
