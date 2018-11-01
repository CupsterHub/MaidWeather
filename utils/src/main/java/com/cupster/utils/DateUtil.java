package com.cupster.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Cupster on 2018/10/30.
 */

public class DateUtil {

    /**
     * 获取指定格式的当前时间，如：2018-02-26 09:50:29
     *
     * @param format yyyy-MM-dd HH:mm:ss
     */
    public static String getCurrTime(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }

    /**
     * 获取昨天的日期 ：20180225 。
     */
    public static String getYesterday() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        return sdf.format(date);
    }
}
