package com.Test;
import java.util.*;
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();
        list.add("Ram");
        list.add("Krishna");
        list.add("Samuel");
        list.add("Mohammad");
        ListIterator iterator=list.listIterator();
        while (iterator.hasNext())
        {
            System.out.print(" "+iterator.next());
        }


    }
}
