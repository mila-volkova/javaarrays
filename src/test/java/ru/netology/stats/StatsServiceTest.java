package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void samSalesTest() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long actual = service.samSales(sales);
            long expected = 180;
            Assertions.assertEquals(actual, expected);
        }
    }

    @Test
    public void averageSalesTest() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long actual = service.averageSales(sales);
            long expected = 180 / 12;
            Assertions.assertEquals(actual, expected);
        }
    }

    @Test
    public void monthBiggestSalesTest() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long actual = service.monthBiggestSales(sales);
            long expected = 8;
            Assertions.assertEquals(actual, expected);
        }
    }

    @Test
    public void monthMinimumSalesTest() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long actual = service.monthMinimumSales(sales);
            long expected = 9;
            Assertions.assertEquals(actual, expected);
        }
    }

    @Test
    public void monthOfBelowAverageSalesTest() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long actual = service.monthOfBelowAverageSales(sales);
            long expected = 5;
            Assertions.assertEquals(actual, expected);
        }
    }

    @Test
    public void monthOfAboveAverageSalesTest() {
        StatsService service = new StatsService();
        {
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long actual = service.monthOfAboveAverageSales(sales);
            long expected = 5;
            Assertions.assertEquals(actual, expected);
        }
    }
}
