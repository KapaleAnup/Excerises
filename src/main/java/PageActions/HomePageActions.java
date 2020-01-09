package PageActions;

import BaseClass.BaseController;
import PageLocators.HomePageLocators;

public class HomePageActions extends BaseController {

    HomePageLocators locators = new HomePageLocators();


        public boolean VerifyLogo(){

        Timeouts();

     return  locators.logo.isDisplayed();


    }
    public void SearchFunction(){

     locators.SearchInput.sendKeys("London");


    }



    public void SearchSubmit(){
        locators.SearchButton.isSelected();

        locators.SearchButton.click();
    }

}
