package clinic.designPattern.creationalDP.abstractFactoryMethod2DP.topping;

import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.sauce.CaliforniaSauce;
import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.cheese.Cheese;
import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.cheese.GoatCheese;
import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.sauce.Sauce;

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
