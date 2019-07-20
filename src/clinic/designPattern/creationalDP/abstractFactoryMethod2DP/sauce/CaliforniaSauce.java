package clinic.designPattern.creationalDP.abstractFactoryMethod2DP.sauce;

public class CaliforniaSauce implements Sauce
{
    public CaliforniaSauce()
    {
        prepareSauce();
    }

    @Override
    public void prepareSauce()
    {
        System.out.println("preparing california sauce...");
    }
}
