package org.skypro.skyshop;
import org.skypro.skyshop.ProductBasket;

public class ProductBasket {
    // массив из 5 элементов, прямой доступ только внутри класса
    private Product[] products = new Product[5];
    private int size = 0;

    //  Добавление продукта в корзину
    public void addProduct(Product product) {
        if (size >= products.length) {
            System.out.println("Невозможно добавить продукт");
            return;
        }
        products[size] = product;
        size++;
    }

    // Получение общей стоимости корзины
    public int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    // Печать содержимого корзины
    public void printBasket() {
        if (size == 0) {
            System.out.println("в корзине пусто");
            return;
        }
        for (int i = 0; i < size; i++) {
            Product p = products[i];
            System.out.println(p.getName() + ": " + p.getPrice());
        }
        System.out.println("Итого: " + getTotalPrice());
    }

    // Проверка продукта по имени
    public boolean containsProduct(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    // 5. Очистка корзины
    public void clear() {
        for (int i = 0; i < size; i++) {
            products[i] = null;
        }
        size = 0;
    }
}
