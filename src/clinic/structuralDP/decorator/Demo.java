package clinic.structuralDP.decorator;

public class Demo
{
    public static void main(String[] args)
    {
        ChristmasTree tree = new BubbleLights(new Garland(new ChristmasTreeImpl()));
        System.out.println(tree.decorate());

    }
}
