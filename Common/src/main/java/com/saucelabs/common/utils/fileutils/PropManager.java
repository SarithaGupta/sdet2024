package com.saucelabs.common.utils.fileutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropManager {
    String configFilePath;
    public PropManager(String configFilePath) {
        this.configFilePath = configFilePath;

    }
    public String getProperty(String key) throws IOException {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(configFilePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return props.getProperty(key);


    }
}
