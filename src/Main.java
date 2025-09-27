public class Main {
    public static void main(String[] args) {
        System.out.println("---1 задание---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("---2 задание---");
        for (int q = 10; q >= 1; q--) {
            System.out.println(q);
        }

        System.out.println("---3 задание---");
        for (int w = 2; w <= 17; w += 2) {
            System.out.println(w);
        }

        System.out.println("---4 задание---");
        for (int e = 10; e >= -10; e--) {
            System.out.println(e);
        }

        System.out.println("---5 задание---");
        for (int r = 1904; r < 2096; r += 4) {
            System.out.println(r + " год является високосным");
        }
        System.out.println("---6 задание---");
        for (int t = 7; t < 100; t += 7) {
            System.out.println(t);
        }
        System.out.println("---7 задание---");
        for (int y = 1; y < 515; y *= 2) {
            System.out.println(y);
        }
        System.out.println("---8 задание---");
        int sallary = 29000;
        int months = 12;
        int moneyInJar = 0;
        for (int month = 1; month < months; month++) {
            moneyInJar = moneyInJar + sallary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + moneyInJar);
        }
        System.out.println("---9 задание---");
        int sallaryB = 29000;
        int monthsB = 12;
        int moneyInBank = 0;
        for (int month = 1; month < monthsB; month++) {
            moneyInBank = (moneyInBank + sallaryB) + (moneyInBank / 100 * 12);
            System.out.println("Месяц " + month + " сумма накоплений равна " + moneyInBank);
        }
        System.out.println("---10 задание---");
        int a = 2;
        for (int c = 1; c <= 10; c++) {
            System.out.println(a + "*" + c + "=" + (2 * c));
        }

    }


}


