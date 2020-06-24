package demoqapractice;

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

public class Forms {

    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://www.demoqa.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void fillForm() {

        driver.findElement(By.xpath("//h5[contains(text(),'Forms')]")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();

        driver.findElement(By.id("firstName")).sendKeys("firstName");
        driver.findElement(By.id("lastName")).sendKeys("lastName");
        driver.findElement(By.id("userEmail")).sendKeys("testuser@test.com");

        List<WebElement> genderList = driver.findElements(By.xpath("//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']//div"));
        int count = genderList.size();
        System.out.println(count);

        for(int i=0;i<genderList.size();i++){
           String listGender =  genderList.get(0).getText();
            //System.out.println(listGender);
            genderList.get(0).click();
            System.out.println("Gender selected :" + listGender);
        }

        driver.findElement(By.id("userNumber")).sendKeys("1234567890");

        driver.findElement(By.id("dateOfBirthInput")).click();

        WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));

       selectValueFromDropDown(month, 10);

        WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));

        selectValueFromDropDownValue(year, "1989");


        WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--008']"));
        date.click();

        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        String intputdate = dateOfBirth.getAttribute("value");
        System.out.println("Selected date of birth is :" +intputdate);

      //  driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"))
               //.sendKeys("English");
        WebElement hobie =   driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//div//div//input"));
        boolean flag =  hobie.isSelected();

       List<WebElement> hobbies = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']//div//div//input"));

        for (WebElement listofhobbies: hobbies
             ) {
            if(flag == false){
                hobbies.get(0).click();
                System.out.println("value is selected");
                System.out.println("Selected hobie is :" + listofhobbies);
            }else{
                System.out.println("value not is selected");
            }

        }

    }



    private void selectValueFromDropDown(WebElement element, int index){
        Select dropdown = new Select(element);
        dropdown.selectByIndex(index);
    }
    private void selectValueFromDropDownValue(WebElement element, String value){
        Select dropdown = new Select(element);
        dropdown.selectByValue(value);
    }
    private void selectValueFromDropDownText(WebElement element, String text){
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(text);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
