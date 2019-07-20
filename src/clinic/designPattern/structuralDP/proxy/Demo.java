package clinic.designPattern.structuralDP.proxy;

public class Demo
{
    public static void main(String[] args)
    {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();

        ExpensiveObject object2 = new ExpensiveObjectProxy();
        object2.process();
    }
}
