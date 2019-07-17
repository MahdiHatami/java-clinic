package clinic.creationalDP.abstractFactoryMethodDP;

public class ColorFactory implements AbstractFactory<Color>
{
    @Override
    public Color create(String color)
    {
        if ("White".equalsIgnoreCase(color)) {
            return new White();
        }
        return null;
    }
}
