package clinic.designPattern.creationalDP.prototypeDP;

import java.util.Hashtable;

class ShapeCache
{
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    static Shape getShape(String shapeId)
    {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    static void loadCache()
    {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
