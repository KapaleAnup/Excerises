package testngTutorial;

import org.testng.annotations.*;

public class TC1 {


    @BeforeClass
    public void Beforclass(){
        System.out.println("This will execute before every class");
    }


    @AfterClass
    public void Aferclass(){
        System.out.println("This will execute AFTER every class");
    }

    @BeforeMethod
    public void Beforemethod(){
        System.out.println("This will execute before every method");
    }


   @AfterMethod
    public void Afermethod(){
        System.out.println("This will execute AFTER every method");
    }

    @Test
    public void Customer(){
        System.out.println("This is addCustomer test");
    }

    @Test
    public void deleteCustomer(){
        System.out.println("This is addCustomer test");
    }

}
