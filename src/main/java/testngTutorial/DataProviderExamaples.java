package testngTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamaples {


    @Test(dataProvider = "LoginDataProvider",dataProviderClass = CustomeDateprovider.class)
    public void loginTest(String email, String pass){

        System.out.println(email + "  " +pass);
    }



}
