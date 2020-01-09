package TestCases;

import BaseClass.BaseController;
import PageActions.HomePageActions;
import PageLocators.HomePageLocators;
import org.testng.annotations.Test;

public class HomePageTest extends BaseController {

    HomePageActions homePageActions = new HomePageActions();



    @Test
    public  void HomeLocators(){

     //   homePageActions.VerifyLogo();
        LOG.info("Home Page logo is displayed and Verified");
        homePageActions.SearchFunction();

        LOG.info("Search input has been entered,Successfully !!!");
        homePageActions.SearchSubmit();

        LOG.info("Search Button is clicked.");


    }
}
