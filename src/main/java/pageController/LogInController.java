package pageController;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInController {
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInButton;

    public LogInController(WebDriver driver){
    PageFactory.initElements(driver,this);

    }
    public  void signInButtonDisplayed(){
        signInButton.isDisplayed();
    }

}
