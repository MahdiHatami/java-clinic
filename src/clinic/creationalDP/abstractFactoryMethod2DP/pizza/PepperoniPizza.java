package clinic.creationalDP.abstractFactoryMethod2DP.pizza;

import clinic.creationalDP.abstractFactoryMethod2DP.topping.BaseToppingFactory;

public class PepperoniPizza extends Pizza
{
    private BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory)
    {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients()
    {
        System.out.println("Preparing ingredients for pepperoni pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
