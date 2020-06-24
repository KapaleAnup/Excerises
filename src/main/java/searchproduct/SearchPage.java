package searchproduct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class SearchPage {

    WebDriver driver;

    public SearchPage(WebDriver search)
    {
        this.driver=search;
    }

    @FindBy(how=How.ID, using="search_input") WebElement txtbx_search;
    @FindBy(how=How.XPATH, using="//button[@title=’Search’]") WebElement btn_search;


    public void enterProductToSearch(String text)
    {
        txtbx_search.sendKeys(text.toLowerCase());
        Reporter.log("Product Entered to search is" +text, true);
    }
    public void clickSearchButton()
    {
        btn_search.click();


    }

}
