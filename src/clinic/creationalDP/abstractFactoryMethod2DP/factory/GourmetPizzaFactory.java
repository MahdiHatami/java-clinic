package clinic.creationalDP.abstractFactoryMethod2DP.factory;

import clinic.creationalDP.abstractFactoryMethod2DP.pizza.CheesePizza;
import clinic.creationalDP.abstractFactoryMethod2DP.pizza.PepperoniPizza;
import clinic.creationalDP.abstractFactoryMethod2DP.pizza.Pizza;
import clinic.creationalDP.abstractFactoryMethod2DP.pizza.VeggiePizza;
import clinic.creationalDP.abstractFactoryMethod2DP.topping.BaseToppingFactory;
import clinic.creationalDP.abstractFactoryMethod2DP.topping.GourmetToppingFactory;

public class GourmetPizzaFactory extends BasePizzaFactory
{
    @Override
    public Pizza createPizza(String type)
    {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new GourmetToppingFactory();
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default:
                throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
