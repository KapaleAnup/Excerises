package testngTutorial;

import org.testng.annotations.Test;

public class IgnoreTest {

    // used key false to disable the testcases.
    @Test(enabled = false)
    public void test1(){
        System.out.println("This test will not be executed as it's disabled...");
    }
}
