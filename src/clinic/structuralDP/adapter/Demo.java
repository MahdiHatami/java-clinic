package clinic.structuralDP.adapter;

public class Demo
{
    public static void main(String[] args)
    {
        Movable bugatti = new BugattiVeyron();
        MovableAdapter bugattiAdapter = new MovableAdapterImpl(bugatti);
        System.out.println(bugattiAdapter.getSpeed()); // should return 431.30312 KMPH
    }
}
