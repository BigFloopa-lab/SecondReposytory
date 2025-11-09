import java.util.Objects;

public class Product {
    String name;
    int id;
    int price;
    String category;

    public Product(String name, int id, int price, String category) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Название - " + this.name + ", id продукта  - " + this.id + ", цена товара  - " + this.price + ", категория товара  - " + this.category;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; // проверить null и класс
        Product product = (Product) o; // приведение к классу Product
        return id == product.id && Objects.equals(category, product.category); // сравнение id и category
    }


}

