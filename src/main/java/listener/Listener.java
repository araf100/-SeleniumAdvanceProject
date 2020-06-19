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

        System.out.println("I'm in onTestStart"+getTestMethodName(iTestResult)+" Start");
    }

    public void onTestSuccess(ITestResult iTestResult) {

        System.out.println("I'm in onTestSuccess"+getTestMethodName(iTestResult)+" Succeed");
    }

    //For Failure need Screen short
    public void onTestFailure(ITestResult iTestResult) {

        System.out.println("I'm in onTestFailure"+getTestMethodName(iTestResult)+" Failed");
    }

    public void onTestSkipped(ITestResult iTestResult) {

        System.out.println("I'm in onTestSkipped"+getTestMethodName(iTestResult)+" Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onTestFailedWithTimeout(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

        System.out.println("I'm in onStart"+iTestContext.getName());
    }

    public void onFinish(ITestContext iTestContext) {

        System.out.println("I'm in onFinish"+iTestContext.getName());

    }
}
