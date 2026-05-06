package model;

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
        if ("red".equals(colour)) {  // проверка цвета (учитываем регистр)
            return 60.0;  // скидка 60% для красных яблок
        }
        return 0.0;  // для остальных цветов — без скидки
    }
}