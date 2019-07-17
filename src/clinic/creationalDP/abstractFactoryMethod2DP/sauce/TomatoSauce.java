package clinic.creationalDP.abstractFactoryMethod2DP.sauce;

public class TomatoSauce implements Sauce
{
    public TomatoSauce()
    {
        prepareSauce();
    }

    @Override
    public void prepareSauce()
    {
        System.out.println("preparing tomato sauce...");
    }
}
