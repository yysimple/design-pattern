package com.jxkj.jdksource;

import java.util.Calendar;
import java.util.Date;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
public class FactoryTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println(calendar);
    }
}
