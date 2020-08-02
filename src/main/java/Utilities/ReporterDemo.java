package Utilities;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterDemo {


    @Test
    public void getdata(){

        Reporter.log("test the data");
       // Reporter.setCurrentTestResult(ITestResult.SUCCESS);

    }
}
