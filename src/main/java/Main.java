import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных — создаём объекты продуктов
        Meat meat = new Meat(5, 100); // 5 кг мяса по 100 руб./кг

        Apple redApples = new Apple(10, 50, model.constants.Colour.RED);
        Apple greenApples = new Apple(8, 60, model.constants.Colour.GREEN);

        // Создаём массив продуктов
        Food[] products = {meat, redApples, greenApples};

        // Инициализируем корзину
        ShoppingCart cart = new ShoppingCart(products);

        // Вычисляем и выводим результаты
        double totalWithoutDiscount = cart.getTotalAmountWithoutDiscount();
        double totalWithDiscount = cart.getTotalAmountWithDiscount();
        double vegetarianTotal = cart.getTotalAmountOfVegetarianProducts();

        System.out.println("Общая сумма товаров без скидки: " + totalWithoutDiscount + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + vegetarianTotal + " руб.");
    }
}

