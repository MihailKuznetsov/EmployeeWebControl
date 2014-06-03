package com.ztaticvienn.controller.util;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mike on 23.05.14.
 */
public class DateParser {

    public static String getStringFromDate(Date date) {
        Format dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String stringDateOfBirth = dateFormat.format(date);
        return stringDateOfBirth;
    }

    public static Date getDateFromString(String stringDateOfBirth) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse(stringDateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;

    }
}