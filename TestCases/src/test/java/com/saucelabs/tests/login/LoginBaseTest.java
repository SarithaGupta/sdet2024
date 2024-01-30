package com.saucelabs.tests.login;

import com.saucelabs.common.utils.logs.TestLogger;
import com.saucelabs.testutils.BaseTest;
import infra.SeleniumTest;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import pages.saucelabs.LoginPage;
import pages.saucelabs.ProdutsPage;


public class LoginBaseTest extends BaseTest {

    protected LoginPage loginPage;
    protected ProdutsPage productPage;
    protected Logger logger;

    public LoginBaseTest(){
        loginPage = new LoginPage();
        productPage = new ProdutsPage();
        logger = TestLogger.init(LoginBaseTest.class.getName());


    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod() from loginBaseTest...");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass() from loginBaseTest...");
        SeleniumTest.getDriver().close();
    }
}
