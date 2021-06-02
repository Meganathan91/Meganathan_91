package com.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class InvalidDateformatprovided extends RuntimeException {
    public InvalidDateformatprovided(String desc) {
        super("InvalidDateformatprovided");
    }
}

public class DateValidate {
    static void dateValidate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in dd-MM-yyy format :");
        String date = scanner.nextLine();

        if (date.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                dateFormat.parse(date);
            } catch (Exception e) {
                e.printStackTrace();
            }

            /*Date d = dateFormat.parse(date);
            String s = dateFormat.format(d);
            System.out.println("Valid format :" + s);*/
        } else {
            System.out.println("InvalidDateformatprovided");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            dateValidate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}