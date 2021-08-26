package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateUtility {
    public static Date getDate(String date) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        Date _date = null;
        while (repeat) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                _date = dateFormat.parse(date);
                repeat = false;
            } catch (ParseException e) {
                System.out.print("Enter valid date, Format ( yyyy/MM/dd ) ... ");
                date = scanner.next();
                repeat = true;
            }
        }
        return _date;
    }
}
