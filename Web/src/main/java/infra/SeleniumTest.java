package infra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
/*
Singleton design pattern - In entire project we are going to manage the single object.
We can restrict th object creation by using this design pattern. we no need to create more than once.
 */
    public static WebDriver driver;

    private static SeleniumTest seleniumTest = null;
    public static SeleniumTest getInstance() {
        if(seleniumTest == null){                       //singleton design pattern
            seleniumTest = new SeleniumTest();
        }
        return seleniumTest;
    }


    public void launchBrowser(String browser){
        if(browser.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("FireFox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
           //Edge browser code
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else{
            System.out.println("No browser keyword is matching....");
        }
        //ie browser is deprecated already
        //Maximize the browser
        driver.manage().window().maximize();
        //Delete all cookies
        driver.manage().deleteAllCookies();
    }
    public static WebDriver getDriver(){

        return driver;
    }
    public void closeBrowser(){
        driver.close();
    }
}
