package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double discount = (item instanceof Discountable) ?
                    ((Discountable) item).getDiscount() : 0;
            total += item.getAmount() * item.getPrice() * (1 - discount / 100);
        }
        return total;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}