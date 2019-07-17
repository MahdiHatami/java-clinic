package clinic.creationalDP.abstractFactoryMethod2DP.topping;

import clinic.creationalDP.abstractFactoryMethod2DP.sauce.CaliforniaSauce;
import clinic.creationalDP.abstractFactoryMethod2DP.cheese.Cheese;
import clinic.creationalDP.abstractFactoryMethod2DP.cheese.GoatCheese;
import clinic.creationalDP.abstractFactoryMethod2DP.sauce.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory
{
    @Override
    public Cheese createCheese()
    {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce()
    {
        return new CaliforniaSauce();
    }
}
