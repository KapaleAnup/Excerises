package testngTutorial;

import org.testng.annotations.Test;

public class FirstTest {


    @Test(priority = 1)
    public void setpup(){
        System.out.println("This is setup test");
    }


    @Test(priority = 2)
    public void login(){
        System.out.println("This is login test");
    }



    @Test(priority = 3)
    public void TearDown(){
        System.out.println("closing browser");
    }
}
