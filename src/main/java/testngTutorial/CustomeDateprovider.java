package testngTutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomeDateprovider {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {

        Object[][] data = {{"abc@gmail.com", "abs"}, {"xyz@test.com", "test"}, {"gsgs@test.com", "user"}};
        return data;
    }
}


