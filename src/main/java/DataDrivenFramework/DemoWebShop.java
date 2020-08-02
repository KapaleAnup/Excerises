package DataDrivenFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DemoWebShop {


    public WebDriver driver;

    ExcelOperartions excelOperartions = new ExcelOperartions("Registration");

    @Test(dataProvider = "registrationData")
    public void dataDriverFLow(Object object){

        HashMap<String, String> registrationData = (HashMap<String, String>) object;

        System.out.println("Test Data is :" + registrationData);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://demowebshop.tricentis.com/register");

        String selectedGender =  getGender("F");
        System.out.println(selectedGender);
        selectGender(registrationData.get("Gender"));

        setFirstName(registrationData.get("FirstName"));
        setLastName(registrationData.get("LastName"));
        setEmail(registrationData.get("Email"));


    }


    private String getGender(String gender){

        String genderSelection =  "//input[@value='"+gender+"']";;
        return driver.findElement(By.xpath(genderSelection)).getText();

    }

    private void selectGender(String gender){

        String genderSelection =  "//input[@value='"+gender+"']";;
         driver.findElement(By.xpath(genderSelection)).click();

    }

    private void setFirstName(String firstName){
       driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstName);
    }

    private void setLastName(String lastName){
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lastName);
    }

    private void setEmail(String email){
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
    }



    @DataProvider(name = "registrationData")
    public Object[][] testdataProvider(){

        Object[][] obj = new Object[excelOperartions.getRowCount()][1];

        for (int i=1;i<=excelOperartions.getRowCount();i++){
            try {
               HashMap<String, String> testData = excelOperartions.getTestDataMap(i);
               obj[i-1][0] = testData;
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        return obj;
    }
}
