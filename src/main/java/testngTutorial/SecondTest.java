package testngTutorial;

import org.testng.annotations.Test;

public class SecondTest {


    @Test(priority = 1)
    public void setpup(){
        System.out.println("This is setup test");
    }


    @Test(priority = 2)
    public void SearchCustomer(){
        System.out.println("This is SearchCustomer test");
    }

    @Test(priority = 2)
    public void addCustomer(){
        System.out.println("This is addCustomer test");
    }

    @Test(priority = 3)
    public void TearDown(){
        System.out.println("closing browser");
    }
}
