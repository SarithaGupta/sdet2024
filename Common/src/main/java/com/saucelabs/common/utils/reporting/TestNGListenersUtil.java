package com.saucelabs.common.utils.reporting;

import com.listeners.CustomListener;
import com.saucelabs.common.utils.logs.TestLogger;
import org.apache.logging.log4j.Logger;
import org.testng.*;

public class TestNGListenersUtil implements ITestListener,IReporter, IExecutionListener {
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
        sendTestStatusToDataBase(arg0,"Skipped");
    }
    //This belongs to ITestListener and will execute when a test is passed
    public void onTestSuccess(ITestResult arg0){
        logger.info("Passed test...." +arg0.getName());
        sendTestStatusToDataBase(arg0,"Pass");
    }
    //This belongs to ITestListener and will execute when a test is failed
    public void onTestFailure(ITestResult arg0){
        logger.info("Failed test...." +arg0.getMethod().getMethodName());
        sendTestStatusToDataBase(arg0,"Failed");
        logger.info("Test failure message from listeners " +arg0.getThrowable().getMessage());
        logger.info("Test failure StackTrace from listeners " +arg0.getThrowable().getStackTrace());

    }
    //Not so important... Ignore as of now
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){

    }


    public void onExecutionStart(){
        logger = TestLogger.init(TestNGListenersUtil.class.getName());
        logger.info("onTestExecutionStart().. started.....!!");

    }
    public void onExecutionFinish(){
        logger.info("onTestExecutionFinish().. finished.....!!");

    }
    public void sendTestStatusToDataBase(ITestResult result,String testStatus){
        logger.info("sendTestStatusToDataBase()......executed....");
    }


}
