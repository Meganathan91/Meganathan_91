package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DemoDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1991,1,19);
       Date d =  calendar.getTime(); // x

        Calendar cal = Calendar.getInstance();
        cal.set(1991,7,1);
        Date d1 =  cal.getTime(); // y

        String dd = format.format(d); // date in string format
        String mm = format1.format(d1); // date in string format

        Date x = new SimpleDateFormat("yyyy/MM/dd").parse(format.format(d)); // parsing date format
        Date y = new SimpleDateFormat("yyyy/MM/dd").parse(format1.format(d1));

        Date startDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/7/1"); // parsing string format and get  date format
        Date endDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/11/12");

        // System.out.println(startDate +" start----------end "+endDate);

        if(startDate.before(endDate)) {
             // System.out.println("y-----"+startDate);
        }if(y.after(x)) { // x - 1; y - 7
             //System.out.println("x----"+x);
        }

     //   System.out.println(dd+" date "+mm);
       // System.out.println(x+" x------y "+y);
        Date date = new GregorianCalendar(2000,Calendar.JUNE,1).getTime();
        Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse("2021/1/1");

    }
}
