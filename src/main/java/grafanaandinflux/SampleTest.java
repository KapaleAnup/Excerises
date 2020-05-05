package grafanaandinflux;

import org.testng.annotations.Test;

public class SampleTest {

    @Test(description = "login")
    public void login(){
        System.out.println("login");
    }

    @Test(description = "search for flights", dependsOnMethods = "login")
    public void search(){
        System.out.println("search for flights");
    }

    @Test(description = "select flight", dependsOnMethods = "search")
    public void select(){
        System.out.println("select flight");
    }

    @Test(description = "book flight", dependsOnMethods = "select")
    public void book(){
        System.out.println("book flight");
    }

    @Test(description = "logout", dependsOnMethods = "book")
    public void logout(){
        System.out.println("logout");
    }
}
