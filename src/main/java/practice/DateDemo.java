package practice;

import java.util.*;

public class DateDemo {
    static private Map<Long,Date> longDateMap;
    static private Calendar calendar = Calendar.getInstance();

    static {
        longDateMap = new HashMap<>();

        calendar.set(1991,1,2);
        Date d1 = calendar.getTime();

        calendar.set(1978,6,21);
        Date d2 = calendar.getTime();

        calendar.set(1876,4,12);
        Date d3 = calendar.getTime();

        calendar.set(2010,10,19);
        Date d4 = calendar.getTime();

        calendar.set(2001,5,6);
        Date d5 = calendar.getTime();

        longDateMap.put(1l,d1);
        longDateMap.put(2l,d2);
        longDateMap.put(3l,d3);
        longDateMap.put(4l,d4);
        longDateMap.put(5l,d5);
    }
    public static void main(String[] args) {

        System.out.println(longDateMap.get(3l));

    }

}

