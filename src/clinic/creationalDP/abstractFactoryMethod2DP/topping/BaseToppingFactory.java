package clinic.creationalDP.abstractFactoryMethod2DP.topping;

import clinic.creationalDP.abstractFactoryMethod2DP.cheese.Cheese;
import clinic.creationalDP.abstractFactoryMethod2DP.sauce.Sauce;

public abstract class BaseToppingFactory
{
    public abstract Cheese createCheese();

    public abstract Sauce createSauce();
}
