package com.saucelabs.common.utils.logs;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class TestLogger {
  private static Logger logger = null;
  public static Logger init(String className){
      logger = LogManager.getLogger(className);
      return logger;
  }
    public void info(String info) {
        logger.info(info);
    }

    public void info(Exception e) {
        logger.info(e);
    }

    public void error(String info) {
        logger.error(info);
    }

    public void error(Exception e) {
        logger.error(e);
    }

    public void info(String info, Exception e) {
        logger.info(info);
    }

    public void debug(String debug) {
        logger.debug(debug);
    }
}
