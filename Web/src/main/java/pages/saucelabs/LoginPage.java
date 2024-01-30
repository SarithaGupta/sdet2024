package pages.saucelabs;

import infra.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    /*
    1.Username
    2.Password
    3.Login button
    4.Swag Labs Text Logo
    5.Negative scenario validation messages.
    These are the locators we are going to get here .


     */
    //Sample format of creating locators for Login screen
    private static By username= By.id("user-name");
    private static By password = By.name("password");
    private static By loginButton = By.xpath("//input[@class='submit-button btn_action']");

    private static By invalidLoginErrorMessage = By.xpath("//div[@class='error-message-container error']");
    /*
    I dont want to provide any right access outside of the class
    __We are restricting the page object by declaring it as a private
    __Main goal og page object is achieving the reusability.
    -- we are creating all the locators in the private static format

     */



  //Login page operations
    public void enterUsername(String uname){
        sendKeys(username,uname);
    }
    public void clearUsername(){
        clearText(username);
    }
    public void enterPassword(String pwd){
        sendKeys(password,pwd);
    }
    public void clickLogin()
    {
        click(loginButton);
    }
    public String getLoginErrorMessage(){
        return getUIText(invalidLoginErrorMessage);
    }
}
