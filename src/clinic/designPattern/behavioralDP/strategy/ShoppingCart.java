package clinic.designPattern.behavioralDP.strategy;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart
{
    private List<Item> items;

    ShoppingCart()
    {
        items = new ArrayList<>();
    }

    void addItem(Item item)
    {
        items.add(item);
    }

    void removeItem(Item item)
    {
        items.remove(item);
    }

    private int calculateTotal()
    {
        return items.stream().mapToInt(Item::getPrice).sum();
    }

    void pay(PaymentStrategy paymentStrategy)
    {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
