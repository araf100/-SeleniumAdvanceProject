package login;

import base.ScriptBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageController.LogInController;

public class LogInTest extends ScriptBase {
    LogInController logIn;

    /*@BeforeTest
    public void init(){
        beforeTest();
    }*/

    @Test (priority = 1)
    public  void  verifySignInButtonDisplayed() {
        logIn = new LogInController(driver);
       // logIn.signInButtonDisplayed();

    }
    @Test (priority =  2)
    public  void  verifyInvalidLogIn() throws InterruptedException {
        logIn = new LogInController(driver);
        logIn.signIn(driver,"There is 1 error");

    }
}
