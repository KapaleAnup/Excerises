package searchproduct;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PropertyFileDataReader {

    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://demo.cs-cart.com/stores/7ef9bc6516e4e208/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }


    @Test(dataProvider="Data")
    public void searchTheProduct(String product)
    {
        SearchPage oSearch =PageFactory.initElements(driver, SearchPage.class);
        oSearch.enterProductToSearch(product);
        oSearch.clickSearchButton();


    }

    @DataProvider(name="Data")
    public Object[] sendDataToTest() throws Exception
    {
        String[] data= PropertyFileReader.getProperty("product").split(",");
        return data;
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
