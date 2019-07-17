package clinic.creationalDP.factoryMethodDP;

public class PolygonFactory
{
    public Polygon getPolygon(int numberofSides)
    {
        switch (numberofSides) {
            case 3:
                return new Triangle();
            case 4:
                return  new Square();
        }
        return null;
    }
}
