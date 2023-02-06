package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void calculateAmountSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {25, 65, 89, 54, 76, 31};
        int expected = 340;
        int actual = service.calculateAmountSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateAverageSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {65, 82, 49, 20, 0, 5, 76};
        int expected = 42;
        int actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void getMonthOfMaxSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {800, 654, 6351, 5864, 4865, 125, 758, 6351, 462};
        int expected = 8;
        int actual = service.getMonthOfMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void getMonthOfMinSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {152, 548, 6325, 100, 0, 578, 653, 0};
        int expected = 8;
        int actual = service.getMonthOfMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfMonthsBelowAvgSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {582, 45, 876, 825, 864, 215, 147, 258, 369, 123, 456};
        int expected = 7;
        int actual = service.getNumberOfMonthsBelowAvgSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfMonthsAboveAvgSalesTest() {
        StatsService service = new StatsService();
        int[] sales = {8, 56, 45, 85, 46, 85, 35, 79, 14, 85};
        int expected = 6;
        int actual = service.getNumberOfMonthsAboveAvgSales(sales);
        assertEquals(expected, actual);
    }

}












