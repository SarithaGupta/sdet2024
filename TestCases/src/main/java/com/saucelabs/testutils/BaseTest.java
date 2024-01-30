package com.saucelabs.testutils;

import com.saucelabs.common.utils.fileutils.PropManager;
import infra.SeleniumTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BaseTest {
    protected PropManager propManager;
    String configFilePath = System.getProperty("user.dir") + "/config/CONFIG.properties";

    public BaseTest(){
        propManager = new PropManager(configFilePath);
    }
    @BeforeMethod
    public void beforeTest() throws IOException {
        System.out.println("BeforeMethod() from BaseTest....");
        SeleniumTest.getInstance().launchBrowser("Chrome");
        SeleniumTest.getDriver().get(propManager.getProperty("url_google"));
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod() from BaseTest.....");
        //SeleniumTest.getInstance().closeBrowser();
        SeleniumTest.getDriver().close();

    }

}
