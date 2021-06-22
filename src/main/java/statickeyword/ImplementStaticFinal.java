package staticKeyword;

public class ImplementStaticFinal
{
    static final int votForAge=18;
    static String name;
    static
    {
        name="vignesh";
    }
    public static void main(String[] args)
    {
        ImplementStaticFinal staticFinal=new ImplementStaticFinal();
        //staticFinal.votForAge=19;// cannot assign value to final variable.
    }
}
