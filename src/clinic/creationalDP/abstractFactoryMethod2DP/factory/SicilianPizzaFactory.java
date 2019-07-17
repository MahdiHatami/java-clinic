package clinic.creationalDP.abstractFactoryMethod2DP.factory;

import clinic.creationalDP.abstractFactoryMethod2DP.pizza.CheesePizza;
import clinic.creationalDP.abstractFactoryMethod2DP.pizza.PepperoniPizza;
import clinic.creationalDP.abstractFactoryMethod2DP.pizza.Pizza;
import clinic.creationalDP.abstractFactoryMethod2DP.pizza.VeggiePizza;
import clinic.creationalDP.abstractFactoryMethod2DP.topping.BaseToppingFactory;

public class SicilianPizzaFactory extends BasePizzaFactory
{
    private BaseToppingFactory toppingFactory;

    @Override
    public Pizza createPizza(String type)
    {
        Pizza pizza;
        switch (type) {
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
                throw new IllegalArgumentException("No such pizza");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
