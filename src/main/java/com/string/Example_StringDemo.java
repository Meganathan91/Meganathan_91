package com.string;

public class Example_StringDemo {
    public static void main(String[] args) {
        char c = 'a';
        char[] ch = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        //System.out.println(ch);
        String sentence = "";
        String names[] = {"Hi", "Welcome", "Dude"};
        String s = new String("Hi");
        String s1 = new String("Welcome");
        s.concat(s1);
        StringBuffer sb = new StringBuffer("Hi");
        StringBuffer sb1 = new StringBuffer("Welcome");
        sb.append(sb1);
        //StringBuilder sbul = new StringBuilder();
        /*for(String name:names) {
            s.concat(name);
            sb.append(name);
            System.out.println("String hashcode :"+sentence.hashCode());
            System.out.println("StringBuffer hashcode :"+sb.hashCode());
        }*/
        System.out.println("String class :" + s+" "+s1);
        System.out.println("String class :" + sb+" "+sb1);

        //System.out.println("StringBuffer class:" + sb);
    }
}
