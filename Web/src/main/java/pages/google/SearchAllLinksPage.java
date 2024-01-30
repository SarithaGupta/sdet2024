package pages.google;

import infra.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static infra.SeleniumTest.driver;

public class SearchAllLinksPage extends BasePage {
    private static By searchTextArea = By.id("APjFqb");
    private static By google_search_links= By.xpath("//div[@id='rso']//h3");
    public void enterTextToSearch(String text){
        sendKeys(searchTextArea,text);
    }
    public List<WebElement> getAllLinks(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,700)");
        List<WebElement> googleSearchLinks = fetchAllLinks(google_search_links);
        System.out.println("Size----" +googleSearchLinks.size());
        waitForPageToLoad();
        for(int i =0 ;i<googleSearchLinks.size();i++) {
            System.out.println(googleSearchLinks.get(i).getText());
        }
        return googleSearchLinks;
    }

}
