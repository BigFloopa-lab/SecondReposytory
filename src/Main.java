import java.time.Month;

public class Main {
    public static void main(String[] args) {
        System.out.println("---1 task---");
        int firstFriday = 5;
        for (int day = 1; day >= 1 && day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
            }
        }
        System.out.println("---2 task---");
        int distance = 42195;
        int step = 500;
        int covered = 0;
        do {
            covered += step;
            int remained = distance - covered;
            if (remained < 0) {
                remained = 0;
            }
            System.out.println("Держитесь! Осталось " + remained + " метров");
        } while (covered < distance);

        System.out.println("---2.1 task---");
        int distanceB = 42195;
        int stepB = 500;
        for (int coveredB = stepB; coveredB <= distanceB + stepB; coveredB += stepB) {
            int remainedB = distanceB - coveredB;
            if (remainedB < 0) {
                remainedB = 0;
            }
            System.out.println("Держитесь! Осталось " + remainedB + " метров");
        }

        System.out.println("---3 task---");
        int budget = 500;
        int prisePerDay = 100;
        int totalDay = 0;
        int dayCount = 0;

        while (budget >= prisePerDay) {
            dayCount++;

            if (dayCount % 5 == 0) {
                System.out.println("Каждый пятый день на парковке бесплатный!");
                totalDay++;
                continue;
            } else {
                budget -= prisePerDay;
            }

            totalDay++;
            System.out.println("Прошло дней: " + totalDay + ", осталось бюджета: " + budget);
        }


        System.out.println("---3.1 task---");

        int budgetB = 500;
        int prisePerDayB = 100;
        int totalDayB = 0;

        for (int dayCountB = 1; budgetB >= prisePerDayB; dayCountB++) {

            if (dayCountB % 5 == 0) {
                System.out.println("Каждый пятый день на парковке бесплатный!");
                totalDayB++;
                continue;
            } else {
                budgetB -= prisePerDayB;
            }

            totalDayB++;
            System.out.println("Прошло дней: " + totalDayB + ", осталось бюджета: " + budgetB);
        }

        System.out.println("---4 task---");
        int needMoney = 12000000;
        int month = 1;
        int total = 0;
        int moneyPerMonth = 15000;
        while (true) {
            total = total + moneyPerMonth;
            month++;
            if (month % 6 == 0) {
                total = total + (total / 100 * 7);
            }
            if (total >= needMoney) {
                total = needMoney;
                System.out.println("За " + month + " месяц вы отложили " + total + " рублей");
                break;
            }
            System.out.println("За " + month + " месяц вы отложили " + total + " рублей");


        }
        System.out.println("---4.1 task---");
        int needMoneyB = 12000000;
        int monthB = 1;
        int totalB = 0;
        int moneyPerMonthB = 15000;
        do {
            totalB = totalB + moneyPerMonthB;
            monthB++;
            if (monthB % 6 == 0) {
                totalB = totalB + (totalB / 100 * 7);
            }
            if (totalB > needMoneyB) {
                totalB = needMoneyB;
                System.out.println("За " + monthB + " месяц вы отложили " + totalB + " рублей");
                break;
            }
            System.out.println("За " + monthB + " месяц вы отложили " + totalB + " рублей");


        } while (true);

        System.out.println("---5 task---");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                minute += 2;
                continue;
            }
            minute++;
            charge+=2;

            if (overheats >3){
                System.out.println("Досрочное завершение заряда - перегрев!");
                break;
            }


        }System.out.println("Время зарядки составило "+ minute + " минут" + ", уровень зарядки - "+ charge);


    }
}







