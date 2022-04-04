package ru.netology.stats;

public class StatsService {

    //Сумма всех продаж
    public int culcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Средняя сумма всех продаж в месяц
    public int averageSum(int[] sales) {
        return culcSum(sales) / sales.length;
    }

    //    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int numbMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int minSales(int[] sales) {
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

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int numbBelowAverage(int[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSum(sales)) {
                count++;
            }
        }
        return count;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int numbAboveAverage(int[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                count++;
            }
        }
        return count;
    }
}
