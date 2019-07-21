package clinic.designPattern.structuralDP.bridge;

public class Demo
{
    public static void main(String[] args)
    {
        Shape shape = new Square(new Blue());
        System.out.println(shape.draw());
    }
}
