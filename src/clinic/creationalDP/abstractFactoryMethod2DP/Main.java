package clinic.creationalDP.abstractFactoryMethod2DP;

import clinic.creationalDP.abstractFactoryMethod2DP.factory.BasePizzaFactory;
import clinic.creationalDP.abstractFactoryMethod2DP.factory.GourmetPizzaFactory;
import clinic.creationalDP.abstractFactoryMethod2DP.pizza.Pizza;

public class Main
{
    public static void main(String[] args)
    {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("veggie");
    }
}
