package clinic.creationalDP.factoryMethodDP;

public class Main
{
    public static void main(String[] args)
    {
        PolygonFactory factory = new PolygonFactory();
        System.out.println(factory.getPolygon(3));
        System.out.println(factory.getPolygon(4));
    }
}
