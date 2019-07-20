package clinic.designPattern.creationalDP.abstractFactoryMethodDP;

public interface AbstractFactory<T>
{
    T create(String animalType);
}
