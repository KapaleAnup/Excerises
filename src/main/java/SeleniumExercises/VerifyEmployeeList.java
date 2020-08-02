package SeleniumExercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class VerifyEmployeeList {

    private static WebDriver driver;

    private By userName= By.id("txtUsername");
    private By userPassword = By.id("txtPassword");
    private By loginButton = By.id("btnLogin");
    private By pimLinnk = By.xpath("//b[contains(text(),'PIM')]");
    private By employeeList = By.xpath("//a[@id='menu_pim_viewEmployeeList']");
    private By tableColumn= By.xpath("//table[@id='resultTable']//thead//tr//th");
    private By tableRow = By.xpath("//table[@id='resultTable']//tbody//tr//td");
    private By addButton = By.xpath("//input[@name='btnAdd']");
    private By employeeFisrtname = By.xpath("//input[@id='firstName']");
    private By employeeLastName = By.xpath("//input[@id='lastName']");
    private By enterEmployeeId = By.xpath("//input[@id='employeeId']");
    private By saveButton = By.xpath("//input[@id='btnSave']");

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(userName).sendKeys("Admin");
        driver.findElement(userPassword).sendKeys("admin123");
        driver.findElement(loginButton).click();
    }

    @Test(dataProvider = "getData")
    public void testHandlingTable(String firstname, String lastname , String employeeId){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(pimLinnk).click();
        driver.findElement(employeeList).click();

        int tableColumnSize = driver.findElements(tableColumn).size();
        System.out.println(tableColumnSize);
        int tableRowSize = driver.findElements(tableRow).size();
        System.out.println(tableRowSize);

        driver.findElement(addButton).click();
        driver.findElement(employeeFisrtname).sendKeys(firstname);
        driver.findElement(employeeLastName).sendKeys(lastname);
        driver.findElement(enterEmployeeId).sendKeys(employeeId);
        driver.findElement(saveButton).click();

        driver.findElement(employeeList).click();
        for (int i=1;i<=tableRowSize;i++){

            String firstName =  driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr["+i+"]//td[3]")).getText();
            String lastName =  driver.findElement(By.xpath("//table[@id='resultTable']//tbody//tr["+i+"]//td[4]")).getText();
            System.out.println(firstName+ " " + lastName);
        }

        }

       @DataProvider
        public Object[][] getData(){

        return new Object[][] {
                {"axlex","Morgan", "FBS333"},
                {"Max","Morgan", "FBS334"}
        };
        }





    @AfterTest
    public void quiteBrowser(){
        driver.quit();
    }
}
