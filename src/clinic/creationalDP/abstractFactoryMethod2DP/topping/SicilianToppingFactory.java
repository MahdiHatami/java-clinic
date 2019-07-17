package clinic.creationalDP.abstractFactoryMethod2DP.topping;

import clinic.creationalDP.abstractFactoryMethod2DP.cheese.Cheese;
import clinic.creationalDP.abstractFactoryMethod2DP.cheese.MozzarellaCheese;
import clinic.creationalDP.abstractFactoryMethod2DP.sauce.Sauce;
import clinic.creationalDP.abstractFactoryMethod2DP.sauce.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory
{
    @Override
    public Cheese createCheese()
    {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce()
    {
        return new TomatoSauce();
    }
}
