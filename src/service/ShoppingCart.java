package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма без скидки
    public double getSumWithoutDiscount() {
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {

            total = total + (items[i].getAmount() * items[i].getPrice());
        }
        return total;
    }

    // Общая сумма товаров в корзине со скидкой
    public double getSumWithDiscount() {
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            // Получаем текущий товар
            Food item = items[i]; //

            // Используем геттеры
            double price = item.getAmount() * item.getPrice();

            if (item instanceof Discountable) {
                double discount = ((Discountable) item).getDiscount();
                price = price * (100 - discount) / 100;

            }

            total = total + price;
        }
        return total;
    }

    // Сумма всех вегетарианских продуктов без скидки
    public double getVegetarianSumWithoutDiscount() {
        double total = 0.0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                total = total + items[i].getAmount() * items[i].getPrice();
            }
        }
        return total;
    }
}