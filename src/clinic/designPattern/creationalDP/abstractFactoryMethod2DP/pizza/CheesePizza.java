package clinic.designPattern.creationalDP.abstractFactoryMethod2DP.pizza;

import clinic.designPattern.creationalDP.abstractFactoryMethod2DP.topping.BaseToppingFactory;

public class CheesePizza extends Pizza
{
    private BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory)
    {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients()
    {
        System.out.println("preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
