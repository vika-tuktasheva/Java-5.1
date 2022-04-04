package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    //Сумма всех продаж
    @Test
    void shouldCulcSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.culcSum(sales);
        assertEquals(expected, actual);
    }

    //Средняя сумма всех продаж в месяц
    @Test
    void shouldAverageSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageSum(sales);
        assertEquals(expected, actual);
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    @Test
    void shouldNumbMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.numbMaxSales(sales);
        assertEquals(expected, actual);
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void shouldNumbBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numbBelowAverage(sales);
        assertEquals(expected, actual);
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    @Test
    void shouldNumbAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.numbAboveAverage(sales);
        assertEquals(expected, actual);
    }
}