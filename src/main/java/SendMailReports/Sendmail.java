package SendMailReports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sendmail {

        //Creating ExtentReport and ExtentTest  reference values
        ExtentReports report;
        ExtentTest logger;

        @Test
        public void verifysum(){

            //Create object for Report with filepath
            report=new ExtentReports("./Reports/TestReport.html");

            //Start the test
            logger=report.startTest("VerifySum");

            //Log the status in report
            logger.log(LogStatus.INFO, "calc started ");

            logger.log(LogStatus.INFO, "Test", "Test again");

            int a=50,b=80,c;
            c=a+b;
            Assert.assertEquals(c, 130);

            //Pass the test in report

            if(c==c) {
                logger.log(LogStatus.PASS, "Test Verified");
                report.endTest(logger);

            }else{
                logger.log(LogStatus.FAIL, "Test Failed.");
                report.endTest(logger);
            }
            //End the test


            //Flush the data to report
            report.flush();
        }
    }

