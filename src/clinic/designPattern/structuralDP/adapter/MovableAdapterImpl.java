package clinic.designPattern.structuralDP.adapter;

public class MovableAdapterImpl implements MovableAdapter
{
    private Movable luxuryCars;

    public MovableAdapterImpl(Movable buggati)
    {
        luxuryCars = buggati;
    }

    @Override
    public double getSpeed()
    {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph)
    {
        return mph * 1.60934;
    }
}