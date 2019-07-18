package clinic.designPattern.creationalDP.abstractFactoryMethod2DP.cheese;

public class MozzarellaCheese implements Cheese
{
    public MozzarellaCheese()
    {
        prepareCheese();
    }

    @Override
    public void prepareCheese()
    {
        System.out.println("preparing mozzarella cheese...");
    }
}
