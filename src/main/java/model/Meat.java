package model;

public class Meat extends Food {
    // Конструктор принимает два параметра: количество и цену
    public Meat(int amount, double price) {
        this.amount = amount;  // инициализируем поле amount
        this.price = price;    // инициализируем поле price
        this.isVegetarian = false;  // устанавливаем флаг isVegetarian в false
    }
}

