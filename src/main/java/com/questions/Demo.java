package com.Doubts;
class Multi
{
    static Multi mul=null;
    private Multi()
    {

    }
   static public Multi getInstance()
   {
       Multi m=new Multi();
       if(mul==null)
       {
           new Multi();
       }

       return m;
   }
}
public class Demo
{
    public static void main(String[] args)
    {
    Multi m=Multi.getInstance();
    //Multi mm=new Multi();
    }
}


 class demo
{
    void get()
    {

    }

}
class Sample
{
    void get()
    {

    }
}

