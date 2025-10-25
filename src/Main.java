public class Main {

    public static void main(String[] args) {

        System.out.println("--- Проверка високосных годов ---");
        checkLeapYear(2020);


        System.out.println("\n--- Рекомендации приложений ---");

        recommendAppVersion(0, 2014);


        System.out.println("\n--- Расчет дней доставки ---");

        calculateDeliveryDays(10);
        calculateDeliveryDays(35);
        calculateDeliveryDays(75);
        calculateDeliveryDays(95);
        calculateDeliveryDays(120);
    }

    public static void checkLeapYear(int year) {

        boolean isLeap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);


        if (isLeap) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = 2024;

        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }


    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Дистанция: " + deliveryDistance + " км - доставки нет");
            return -1;
        }

        System.out.println("Потребуется дней: " + deliveryDays);
        return deliveryDays;
    }
}