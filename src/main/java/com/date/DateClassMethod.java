package com.date;

import java.util.Date;

public class DateClassMethod {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(2012 - 10 - 20);
        Date date2 = new Date(2020 - 12 - 12);// 2018,12,12 This format will give the Millisecond
        boolean b = date.before(date2);
        System.out.println("date2 come before date :" + b);
        boolean b1 = date2.after(date1);
        System.out.println("date2 come after date :" + b1);
        int c = date.compareTo(date1);
        System.out.println(c);
        System.out.println(date.getTime());
        System.out.println("Before setting Miliseconds :" + date2);
        date2.setTime(1235342525556l);
        System.out.println("After setting Miliseconds :" + date2);
        System.out.println("W/o toString method :"+date);
        System.out.println("using toString method :"+date.toString());


    }
}
