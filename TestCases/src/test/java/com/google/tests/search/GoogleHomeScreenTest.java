package com.google.tests.search;

import org.testng.annotations.Test;

public class GoogleHomeScreenTest extends FetchAllLinksTest {
    @Test(priority = 1,description = "Fetch All Available Links Present Based on Our Search")
    public void searchAllLinksTest() throws InterruptedException {
        System.out.println("Google search test execution started...!");
        searchAllLinksPage.enterTextToSearch("north indian dishes");
        searchAllLinksPage.getAllLinks();
        System.out.println("Google search test results are showing...!");

    }
}
