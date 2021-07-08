package com.Exception;

public class DemoException
{
    public static void main(String[] args) {
        try{
            //System.out.println("hi");
            throw new Exception("hi");
        }catch (RuntimeException e){

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
