package clinic.designPattern.creationalDP.abstractFactoryMethod2DP.topping;

import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.cheese.Cheese;
import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.sauce.Sauce;

public abstract class BaseToppingFactory
{
    public abstract Cheese createCheese();

    public abstract Sauce createSauce();
}
