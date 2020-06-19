package pageController;

import org.openqa.selenium.By;
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
    public  void signInButtonDisplayed(WebDriver driver){
        //signInButton.isDisplayed();
       String signIn= "sign it";
       stringReplacement(driver,signIn.replace("it","In"));
       System.out.println(signIn);

    }

    public void stringReplacement(WebDriver driver,String signIn){
    driver.findElement(By.xpath("//a[contains(text(),'"+signIn+"')]")).isDisplayed();
    }

    public  void signIn(WebDriver driver,String  message) throws InterruptedException {
        Thread.sleep(1000);
    signInButton.click();
    userName.sendKeys("abcd@gmail.com");
    userPassword.sendKeys("12345");
    submitLogIn.click();
   // Assert.assertEquals(invalidLogInError,invalidLogInError);
}

    public  void  errorMessage(WebDriver driver,String  message){
        driver.findElement(By.xpath("//p[contains(text(),'"+message+"')]")).isDisplayed();
}

}
