package ru.netology.stats;

public class StatsService {
    public long sumSale(long[] sales) {
     long totalSale = 0;
     for (long sale : sales) {
         totalSale += sale;
     }
     return totalSale;
    }

    public long averageSale(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        long average = totalSale / 12;
        return average;
    }

    public long maxMonthSale(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minMonthSale(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long bellowAverage(long[] sales) {
        long average = averageSale(sales);
        int counter = 0;

        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }

    public long overAverage(long[] sales) {
        long average = averageSale(sales);
        int counter = 0;

        for (long sale : sales) {
            if (sale > average) {
                counter++;
            }
        }
        return counter;
    }
}

