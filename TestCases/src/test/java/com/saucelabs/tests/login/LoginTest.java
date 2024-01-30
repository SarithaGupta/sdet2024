package com.saucelabs.tests.login;

import com.saucelabs.testutils.BaseTest;
import infra.SeleniumTest;
import org.testng.annotations.Test;

public class LoginTest extends LoginBaseTest {
/*
--->Except testcases we added all our code under sr/main/java only.
 */
    //simple login test
    @Test(priority = 1,description = "Login to Saucelab")
    public void loginToSaucelabTest() throws InterruptedException {
        System.out.println("Saucelabs login test execution started...!");
        logger.info("login test execution started...!");

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
        Thread.sleep(3000);
        System.out.println("Saucelabs login test completed...!");
        logger.info("login test execution ended...!");

        //Wait o page load
        productPage.waitForPageToLoad();
        Thread.sleep(3000);

        //sort the products by using sorting dropdown - Sort with Price High To Low
        productPage.sortTheProducts_with_Price_High_To_Low("Price (high to low)");

    }

    /*@Test(priority = 2,description = "Invalid Login Test")
    public void invalidLoginTest() throws InterruptedException {
        logger.info("invalid login test execution started...!");

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("@Test12345");
        loginPage.clickLogin();

        logger.info(loginPage.getLoginErrorMessage());

    } */

}
