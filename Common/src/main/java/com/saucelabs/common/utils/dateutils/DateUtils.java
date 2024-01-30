package com.saucelabs.common.utils.dateutils;

import java.text.DateFormat;
import java.util.Date;

public class DateUtils {
    public String  parseTheDate(long  inputDate){
        //write the logic

            Date date = new Date (inputDate * 1000);
            return DateFormat.getInstance().format(date).toString();

    }
}
