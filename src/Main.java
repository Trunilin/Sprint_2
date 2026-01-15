import model.Apple;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаём продукты
        Meat meat = new Meat(5, 100.0);
        Apple redApples = new Apple(10, 50.0, Colour.RED);
        Apple greenApples = new Apple(8, 60.0, Colour.GREEN);

        // Массив продуктов
        model.Food[] products = {meat, redApples, greenApples};

        // Инициализируем корзину
        ShoppingCart cart = new ShoppingCart(products);

        // Вывод результатов
        System.out.println("Общая сумма без скидки: " + cart.getSumWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getSumWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianSumWithoutDiscount());
    }
}
