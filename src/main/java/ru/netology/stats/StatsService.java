package ru.netology.stats;

public class StatsService {
    public long samSales(long[] sales) {
        long generalSales = 0;
        for (long sale : sales) {
            generalSales += sale;

        }
        return generalSales;
    }


    public long averageSales(long[] sales) {
        return samSales(sales) / sales.length;
    }

    public int monthBiggestSales(long[] sales) {
        int monthMaximum = 0;
        long saleMaximum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];


            }
        }

        return monthMaximum + 1;

    }

    public int monthMinimumSales(long[] sales) {
        int monthMinimum = 0;
        long saleMinimum = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinimum) {
                monthMinimum = i;
                saleMinimum = sales[i];


            }
        }

        return monthMinimum + 1;

    }

    public int monthOfBelowAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                counter++;
            }
        }

        return counter;
    }

    public int monthOfAboveAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                counter++;
            }
        }

        return counter;
    }
}