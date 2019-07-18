package clinic.designPattern.creationalDP.abstractFactoryMethodDP;

public class Dog implements Animal
{
    @Override
    public String getAnimal()
    {
        return "Doc";
    }

    @Override
    public String makeSound()
    {
        return "How";
    }
}
