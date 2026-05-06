package model;

// Импортируем оба класса из подпакета constants
import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    private String colour; // цвет яблок

    // Конструктор с тремя параметрами
    public Apple(int amount, double price, String colour) {
        this.amount = amount;  // количество
        this.price = price;    // цена
        this.colour = colour;  // цвет
        this.isVegetarian = true;  // яблоки — вегетарианский продукт
    }

    // Реализация метода getDiscount из интерфейса Discountable
    @Override
    public double getDiscount() {
        // Используем константу Colour.RED для проверки цвета
        if (Colour.RED.equals(colour)) {
            // Используем константу Discount.DISCOUNT_60 вместо числа 60.0
            return Discount.DISCOUNT_60;  // скидка для красных яблок
        }
        return 0.0;  // для остальных цветов — без скидки
    }
}
