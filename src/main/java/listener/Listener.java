package listener;

import base.ScriptBase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends ScriptBase implements ITestListener {


    private static String getTestMethodName(ITestResult iTestResult){

        return  iTestResult.getMethod().getConstructorOrMethod().getName();

    }
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("I'm in on---"+getTestMethodName(iTestResult)+"Start");
    }

    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("I'm in on Test---"+getTestMethodName(iTestResult)+"Success");
    }

    //For Failure need Screen short
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("I'm in on Test---"+getTestMethodName(iTestResult)+"Failure");
    }

    public void onTestSkipped(ITestResult iTestResult) {

        System.out.println("I'm in on Test---"+getTestMethodName(iTestResult)+"Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onTestFailedWithTimeout(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

        System.out.println("I'm in on Start"+iTestContext.getName());
    }

    public void onFinish(ITestContext iTestContext) {

        System.out.println("I'm in on Finish"+iTestContext.getName());

    }
}
