package clinic.designPattern.creationalDP.abstractFactoryMethod2DP.cheese;

public class GoatCheese implements Cheese
{
    public GoatCheese()
    {
        prepareCheese();
    }

    @Override
    public void prepareCheese()
    {
        System.out.println("preparing goat cheese...");
    }
}
