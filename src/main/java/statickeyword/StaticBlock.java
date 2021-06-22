package staticKeyword;

public class StaticBlock
{
    public void finalize(){
        System.out.println("memory is free by gc");
    }
    static
    {
        System.out.println("second");
    }

    public static void main(String[] args) {
        StaticBlock block=new StaticBlock();
        block=null;
        System.gc();
    }
}
