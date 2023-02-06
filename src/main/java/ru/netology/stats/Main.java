package ru.netology.stats;


public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.calculateAmountSales(sales));
        System.out.println(service.calculateAverageSales(sales));
        System.out.println(service.getMonthOfMaxSales(sales));
        System.out.println(service.getMonthOfMinSales(sales));
        System.out.println(service.getNumberOfMonthsBelowAvgSales(sales));
        System.out.println(service.getNumberOfMonthsAboveAvgSales(sales));
    }
}