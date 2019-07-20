package clinic.designPattern.creationalDP.abstractFactoryMethod2DP.factory;

import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.pizza.Pizza;

public abstract class BasePizzaFactory
{
    public abstract Pizza createPizza(String type);
}
