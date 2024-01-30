package com.listeners;

import com.saucelabs.common.utils.logs.TestLogger;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class ListenersTest {
    Logger logger = TestLogger.init(ListenersTest.class.getName());

    @Test
    void test1(){
        logger.info("This is Test1");
        Assert.assertEquals("A","A");

    }

    @Test
    void test2(){
        logger.info("This is Test2");
        Assert.assertEquals("A","B");
    }
    @Test
    void test3(){
        logger.info("This is Test3");
        throw new SkipException("This is Skip Exception....");

    }
}
