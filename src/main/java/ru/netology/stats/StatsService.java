package ru.netology.stats;
public class StatsService {

    //#1 Сумму всех продаж
    public int totalCost(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //#2 Среднюю сумму продаж в месяц
    public int avgProfit(int [] sales) {
        int avg = 0;
        avg = totalCost (sales) / sales.length;
        return avg;
    }

    //#3 Номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //#4 Номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //#5 Кол-во месяцев, в которых продажи были ниже среднего
    public int LessthenAvgProfit(int sales[]) {

        int count = 0; // количество итераций
        for (int j = 0; j < sales.length; j++) {
            if (avgProfit(sales) > sales[j]) {
                count++;
            }
        }
        return count;
    }

    //#6 Кол-во месяцев, в которых продажи были выше среднего
    public int MorethenAvgProfit(int sales[]) {

        int count = 0; // количество итераций
        for (int j = 0; j < sales.length; j++) {
            if (avgProfit(sales) < sales[j]) {
                count++;
            }
        }
        return count;
    }
}