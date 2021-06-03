package com.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateValidate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in dd-mm-yyy format :");
        String date = scanner.nextLine();
        try {
            //String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
            dateFormat.parse(date);
            Date d = dateFormat.parse(date);
            String s = dateFormat.format(d);
            System.out.println("Valid format :" + s);
        } catch (ParseException e) {
            System.out.println("Invalid date format Exception");
        }

            /*Date d = dateFormat.parse(date);
            String s = dateFormat.format(d);
            System.out.println("Valid format :" + s);*/

    }
}