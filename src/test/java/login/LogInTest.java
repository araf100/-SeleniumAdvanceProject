package login;

import base.ScriptBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageController.LogInController;

public class LogInTest extends ScriptBase {
    LogInController logInController;

    /*@BeforeTest
    public void init(){
        beforeTest();
    }*/

    @Test (priority = 1)
    public  void  verifySignInButtonDisplayed() {
        logInController = new LogInController(driver);
        logInController.signInButtonDisplayed();

    }
    @Test (priority =  2)
    public  void  verifyInvalidLogIn() throws InterruptedException {
        logInController = new LogInController(driver);
        logInController.signIn(driver,"There is 1 error");

    }
}
