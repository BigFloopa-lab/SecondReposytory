
public class Main {
    public static void liner() {
        System.out.println("====================");
    }

    public static void main(String[] args) {
        liner();
        Product first = new Product("banana", 22, 24, "fruit");
        System.out.println(first.toString());
        Product second = new Product("cucumber", 11,4,"vegetables");
        System.out.println(second.toString());
        System.out.println("Cравнениe первого со вторым - "+ first.equals(second));
        liner();
        Product third = new Product("apple",1,1,"fruit");
        System.out.println(third.toString());
        Product fourths = new Product("apple",1,1,"fruit");
        System.out.println(fourths.toString());
        System.out.println("Сравнение третьего с четвертым - " + third.equals(fourths));
        liner();
        Product [] basket1 = {first, third};
        Product [] basket2 = {first, second};
        Order order1 = new Order("John", basket1);
        Order order2 = new Order("George", basket2);
        System.out.println(order1);
        System.out.println("Сравнение первого и второго заказа: " + order1.equals(order2));

    }

}