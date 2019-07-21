package clinic.designPattern.structuralDP.bridge;

public class Square extends Shape
{
    public Square(Blue blue)
    {
        super.color = blue;
    }

    @Override
    public String draw()
    {
        return "Square drawn. " + color.fill();
    }
}
