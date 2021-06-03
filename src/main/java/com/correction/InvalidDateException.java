package com.correction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InvalidDateException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        try {
            DateFormat format = new SimpleDateFormat("dd-mm-yyyy");
            format.setLenient(false);
            Date d = format.parse(date);
           String s= format.format(d);
            System.out.println(s);
        }catch (ParseException e) {
            System.out.println("Invalid Date format provided");
        }
    }
}