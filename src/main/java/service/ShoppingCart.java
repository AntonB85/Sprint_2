package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Метод для получения общей суммы товаров в корзине без скидки
    public double getTotalAmountWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    // Метод для получения общей суммы товаров в корзине со скидкой
    public double getTotalAmountWithDiscount() {
        double total = 0.0;
        for (Food item : items) {
            if (item instanceof Discountable) {
                total += (item.getAmount() * item.getPrice()) * (1 - ((Discountable) item).getDiscount() / 100);
            } else {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }

    // Метод для получения общей суммы всех вегетарианских продуктов в корзине без скидки
    public double getTotalAmountOfVegetarianProducts() {
        double total = 0.0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}

