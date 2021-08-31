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

        Date startDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/12/12"); // parsing string format and get  date format
        Date endDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/7/12");
        Date checkDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/12/12");
        Date _checkDate = new SimpleDateFormat("yyyy/MM/dd").parse("2021/5/12");

        if(checkDate.compareTo(startDate) == 0) {
              System.out.println(checkDate);
        }

        /*if((checkDate.compareTo(startDate) == 0 || checkDate.after(startDate))
                && (_checkDate.compareTo(endDate) == 0 || _checkDate.before(endDate))) {
            System.out.println("start date check : "+startDate);
        }*/

        if(_checkDate.compareTo(endDate) == 0 || _checkDate.before(endDate)) {
            //System.out.println("end date check : "+endDate);
        }

        Date date = new GregorianCalendar(2000,Calendar.JUNE,1).getTime();
        Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse("2021/1/1");

    }
}
