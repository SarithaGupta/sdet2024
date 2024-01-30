package infra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class BasePage {
    /*
    We can write all the generic method here.
     */
    public void launchUrl(String url){
       // SeleniumTest.getDriver().get("url_google");
    }
    public void click(By locator){
        SeleniumTest.getDriver().findElement(locator).click();
    }
    public void sendKeys(By locator, String text){
        SeleniumTest.getDriver().findElement(locator).sendKeys(text);
        SeleniumTest.getDriver().findElement(locator).sendKeys(Keys.ENTER);
    }
    public List<WebElement> fetchAllLinks(By locator){
        List<WebElement> fetch_All_Links =SeleniumTest.getDriver().findElements(locator);
        return fetch_All_Links;
    }
    public void clearText(By locator){
        SeleniumTest.getDriver().findElement(locator).clear();
    }
    public void waitForPageToLoad(){
        //new syntax for implicit wait for complete page from selenium 4.x
        SeleniumTest.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //old format
       // SeleniumTest.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //deprecated
    }

    public String getUIText(By locator){
       return SeleniumTest.getDriver().findElement(locator).getText();
    }

    public void selectDropDownOptionWithVisibleText(By locator, String inputVisibleText){
        //1. Identification of Web Element
        WebElement dropdown = SeleniumTest.getDriver().findElement(locator);
        //2. Create object fot the Select class
        Select option = new Select(dropdown);
        //3. Perform Operations
        option.selectByVisibleText(inputVisibleText);

    }
    public void selectDropDownOptionWithIndex(By locator, int inputIndex){
        //1. Identification of Web Element
        WebElement dropdown = SeleniumTest.getDriver().findElement(locator);
        //2. Create object fot the Select class
        Select option = new Select(dropdown);
        //3. Perform Operations
        option.selectByIndex(inputIndex);

    }

    public void selectDropDownOptionWithValue(By locator, String inputValueText){
        //1. Identification of Web Element
        WebElement dropdown = SeleniumTest.getDriver().findElement(locator);
        //2. Create object fot the Select class
        Select option = new Select(dropdown);
        //3. Perform Operations
        option.selectByValue(inputValueText);

    }

    public void deselectDropDownOptionWithVisibleText(By locator, String inputText_To_Deselect){
        //1. Identification of Web Element
        WebElement dropdown = SeleniumTest.getDriver().findElement(locator);
        //2. Create object fot the Select class
        Select option = new Select(dropdown);
        //3. Perform Operations
        option.deselectByVisibleText(inputText_To_Deselect);

    }

}
