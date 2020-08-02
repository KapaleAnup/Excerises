package automationdemosite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegistrationPage {


    public static void main(String[] args) {

        WebDriver driver;
      //  WebDriverWait wait = new WebDriverWait(driver, 10);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Data");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Data");

        driver.findElement(By.xpath("//textarea[@ng-model='Adress']"))
                .sendKeys("Mumbai");
        driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"))
                .sendKeys("testuser@test.com");
        driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']"))
                .sendKeys("9999999999");

        String gender = "Male";

        driver.findElement(By.xpath("//input[@type='radio' and @value='" + gender + "']")).click();

        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();

        driver.findElement(By.xpath("//div[@id='msdd']")).click();

        List<WebElement> listOflangs = driver.findElements(By.xpath("//li//a"));

        for (int i = 0; i < listOflangs.size(); i++) {
            String languages = "Croatian";
            if (languages.equalsIgnoreCase(languages)) {
                listOflangs.get(i).click();
                System.out.println("Selected language is :" + languages);
                break;
            }
        }

        WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
        Select listofSkills = new Select(skills);
        int countOfSkills = listofSkills.getOptions().size();
        System.out.println("Total countries are :" + countOfSkills);
        listofSkills.selectByIndex(2);

         WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
       Select countries = new Select(country);
       int countOfCountries = countries.getOptions().size();
        System.out.println("Total countries are :" + countOfCountries);
        countries.selectByValue("India");

    }
    }

