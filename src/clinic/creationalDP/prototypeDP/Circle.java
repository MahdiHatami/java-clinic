package clinic.creationalDP.prototypeDP;

public class Circle extends Shape
{
    public Circle()
    {
        System.out.println("init circle");
        type = "circle";
    }

    @Override
    void draw()
    {
        System.out.println("Inside Circle::draw() method.");
    }
}
