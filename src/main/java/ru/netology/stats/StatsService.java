package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int calculateAvarageSum(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int monthMinSales(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < calculateAvarageSum(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

    public int monthMaxSales(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > calculateAvarageSum(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

}



