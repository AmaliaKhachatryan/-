package ru.netology.stats;

public class StatsService {
    public int calculateAmountSales(int[] sales) {//Сумму всех продаж
        int amountArray = sales[0];
        for (int i = 1; i < sales.length; i++) {
            amountArray = amountArray + sales[i];
        }
        return amountArray;
    }
    public int calculateAverageSales(int[] sales) {//Среднюю сумму продаж в месяц.
        int amountArray =0;// sales[0];
        for (int i = 0; i < sales.length; i++) {
            amountArray = amountArray + sales[i];
        }
        int averageSales = amountArray / sales.length;
        return averageSales;
    }
    public int getMonthOfMaxSales(int[] sales) {//Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
        int maxSalesMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxSalesMonths]) {
                maxSalesMonths = i;
            }
        }
        return maxSalesMonths+1;
    }
    public int getMonthOfMinSales(int[] sales) {//Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
        int minSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSalesMonth]) {
                minSalesMonth = i;
            }
        }
        return minSalesMonth+1;
    }
    public int getNumberOfMonthsBelowAvgSales(int[] sales) {//Количество месяцев, в которых продажи были ниже среднего (см. п.2).

        int average=calculateAverageSales(sales);
        int belowAverageMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverageMonths++;
            }
        }
        return belowAverageMonths+1;
    }
    public int getNumberOfMonthsAboveAvgSales(int[] sales) {//Количество месяцев, в которых продажи были выше среднего (см. п.2)

        int average=calculateAverageSales(sales);
        int aboveAverageMouths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAverageMouths++ ;
            }
        }
        return aboveAverageMouths+1;
    }
}
