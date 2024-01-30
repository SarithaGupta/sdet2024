package com.google.tests.search;

import com.saucelabs.testutils.BaseTest;
import pages.google.SearchAllLinksPage;

public class FetchAllLinksTest extends BaseTest {
    protected SearchAllLinksPage searchAllLinksPage;

    public FetchAllLinksTest(){
        searchAllLinksPage = new SearchAllLinksPage();
    }

}
