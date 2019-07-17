package clinic.creationalDP.abstractFactoryMethod2DP.pizza;

import clinic.creationalDP.abstractFactoryMethod2DP.topping.BaseToppingFactory;

public class VeggiePizza extends Pizza
{
    private BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory)
    {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients()
    {
        System.out.println("Preparing ingredients for veggie pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
