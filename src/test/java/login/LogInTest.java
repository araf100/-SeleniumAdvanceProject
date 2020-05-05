package login;

import base.ScriptBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageController.LogInController;

public class LogInTest extends ScriptBase {
    LogInController logInController;
    @BeforeTest
    public void init(){
        beforeTest();
    }
    @Test
    public  void  verifySignInButtonDisplayed() {
        logInController = new LogInController(driver);
        logInController.signInButtonDisplayed();

    }

}
