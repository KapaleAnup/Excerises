package PageLocators;

import BaseClass.BaseController;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLocators extends BaseController {

    public HomePageLocators(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='q']")
    public WebElement SearchInput;

    @FindBy(xpath = "//button[@id='search-submit']")
    public WebElement SearchButton;

    @FindBy(xpath = "//a[@id='search-tabs-for-sale']")
    public WebElement SalesTab;

    @FindBy(xpath = "//img[@class='icon--logo']")
    public WebElement logo;


}
