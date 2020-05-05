package testngTutorial;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 5000)
    public void test() throws InterruptedException {
        Thread.sleep(6000);
        System.out.println("Test Executed..");
    }
}
