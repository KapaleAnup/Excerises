package grafanaandinflux;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.influxdb.dto.Point;

import java.util.concurrent.TimeUnit;

public class ExecutionListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }

    private void sendTestMethodStatus(ITestResult iTestResult, String status) {
        Point point = Point.measurement("testmethod")
                .time(System.currentTimeMillis(), TimeUnit.MILLISECONDS)
                .tag("testclass", iTestResult.getTestClass().getName())
                .tag("name", iTestResult.getName())
                .tag("description", iTestResult.getMethod().getDescription())
                .tag("result", status)
                .addField("duration", (iTestResult.getEndMillis() - iTestResult.getStartMillis()))
                .build();
        ResultSender.send(point);
    }

    private void sendTestClassStatus(ITestContext iTestContext) {
        Point point = Point.measurement("testclass")
                .time(System.currentTimeMillis(), TimeUnit.MILLISECONDS)
                .tag("name", iTestContext.getAllTestMethods()[0].getTestClass().getName())
                .addField("duration", (iTestContext.getEndDate().getTime() - iTestContext.getStartDate().getTime()))
                .build();
        ResultSender.send(point);
    }
}
