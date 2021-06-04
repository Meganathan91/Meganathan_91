package com.correction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateValidateException {
    void dateException() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String regex = "[0-3]{1}[0-2]{1}-[0-1]{1}[0-2]{1}-[1-9]{1}[0-9]{3}";

        if (date.matches(regex)) {
            DateFormat format = new SimpleDateFormat("dd-mm-yyyy");
            Date d = format.parse(date);
            String s = format.format(d);
            System.out.println(s);
        } else {
            throw new ParseException("Invalid Date format provided", 0);
        }
    }

    public static void main(String[] args) throws Exception {
        DateValidateException validateException = new DateValidateException();
        try {
            validateException.dateException();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }}
