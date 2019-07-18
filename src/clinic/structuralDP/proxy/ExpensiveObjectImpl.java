package clinic.structuralDP.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject
{
    ExpensiveObjectImpl()
    {
        heavyInitialConfiguration();
    }

    private void heavyInitialConfiguration()
    {
        System.out.println("Loading initial configuration...");
    }

    @Override
    public void process()
    {
        System.out.println("processing complete");
    }
}
