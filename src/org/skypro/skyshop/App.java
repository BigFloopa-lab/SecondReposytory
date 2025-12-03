import org.skypro.skyshop.Product;
import org.skypro.skyshop.ProductBasket;

public static void main (String[] args){
    Product first  = new Product("lemon",25);
    Product second = new Product("sourmilk",50);

    ProductBasket basket = new ProductBasket();
    basket.addProduct(first);
    basket.addProduct(second);
    basket.printBasket();

    // Поиск товара, который есть в корзине
    boolean search = basket.containsProduct("lemon");
    System.out.println("lemon в корзине: " + search);


    boolean searchT = basket.containsProduct("milk");
    System.out.println("milk в корзине: " + searchT);

    Product firstT = new Product("bread", 20);
    Product secondT = new Product("egg", 10);
    ProductBasket secondBasket = new ProductBasket();
    basket.addProduct(firstT);
    basket.addProduct(secondT);
    secondBasket.clear();
    secondBasket.printBasket();
    int emptyTotal = secondBasket.getTotalPrice();
    System.out.println("Стоимость пустой корзины: " + emptyTotal);  // ожидаем 0
    boolean hasTea = basket.containsProduct("Чай");
    System.out.println("Чай в корзине: " + hasTea);
}


