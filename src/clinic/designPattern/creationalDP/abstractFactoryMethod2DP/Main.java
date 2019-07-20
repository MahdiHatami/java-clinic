package clinic.designPattern.creationalDP.abstractFactoryMethod2DP;

import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.factory.BasePizzaFactory;
import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.factory.GourmetPizzaFactory;
import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.pizza.Pizza;

public class Main
{
    public static void main(String[] args)
    {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("veggie");
    }
}
