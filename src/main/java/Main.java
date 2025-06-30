import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, redApple, greenApple};

        ShoppingCart cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianTotalWithoutDiscount());
    }
}