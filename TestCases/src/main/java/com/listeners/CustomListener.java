package com.listeners;

import com.saucelabs.common.utils.logs.TestLogger;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    Logger logger = TestLogger.init(CustomListener.class.getName());
    //This belongs to ITestListener and will execute before starting of test set/batch
    public void onStart(ITestContext arg){
        logger.info("Starts Test Execution..." +arg.getName());

    }
    //This belongs to ITestListener and will execute after starting of test set/batch
    public void onFinish(ITestContext arg){
        logger.info("Finish Test Execution..." +arg.getName());
    }
    //This belongs to ITestListener and will execute before the main test start. i.e. @Test
    public void onTestStart(ITestResult arg0){
        logger.info("Starts test......." +arg0.getName());
    }
    //This belongs to ITestListener and will execute when a test is skipped
    public void onTestSkipped(ITestResult arg0){
        logger.info("Skipped test..." +arg0.getName());
    }
    //This belongs to ITestListener and will execute when a test is passed
    public void onTestSuccess(ITestResult arg0){
        logger.info("Passed test...." +arg0.getName());
    }
    //This belongs to ITestListener and will execute when a test is failed
    public void onTestFailure(ITestResult arg0){
        logger.info("Failed test...." +arg0.getName());

    }
    //Not so important... Ignore as of now
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){

    }

}
