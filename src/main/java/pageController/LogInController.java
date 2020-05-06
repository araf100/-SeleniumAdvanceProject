package pageController;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class LogInController {
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInButton;
    @FindBy(id = "email")
    WebElement userName;
    @FindBy(id = "passwd")
    WebElement userPassword;
    @FindBy(css = "#SubmitLogin > span")
    WebElement submitLogIn;
    @FindBy(xpath = "//p[contains(text(),'There is 1 error')]")
    WebElement invalidLogInError;

    public LogInController(WebDriver driver){
    PageFactory.initElements(driver,this);

    }
    public  void signInButtonDisplayed(){
        signInButton.isDisplayed();
    }
public  void signIn() throws InterruptedException {
        Thread.sleep(1000);
    signInButton.click();
    userName.sendKeys("abcd@gmail.com");
    userPassword.sendKeys("12345");
    submitLogIn.click();
    Assert.assertEquals(invalidLogInError,invalidLogInError);
}
}
