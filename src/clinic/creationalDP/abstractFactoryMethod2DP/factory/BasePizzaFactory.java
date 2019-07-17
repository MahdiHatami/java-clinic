package clinic.creationalDP.abstractFactoryMethod2DP.factory;

import clinic.creationalDP.abstractFactoryMethod2DP.pizza.Pizza;

public abstract class BasePizzaFactory
{
    public abstract Pizza createPizza(String type);
}
