package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    int[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldFindSummOfTheMonths() {
        StatsService service = new StatsService();
        int expectedSumm = 180;
        int actualSumm = service.totalcost(arr);
        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    @Test
    public void shouldFindAverageCostPerMonth() {
        StatsService service = new StatsService();
        int expectedSumm = 15;
        int actualSumm = service.AvgProfit(arr);
        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    @Test
    public void shouldFindMonthWithMinProfit() {
        StatsService service = new StatsService();
        int expectedDay = 9;
        int actualDay = service.minSales(arr);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMonthWithMaxProfit() {
        StatsService service = new StatsService();
        int expectedDay = 8;
        int actualDay = service.maxSales(arr);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMonthsLessThenAverage() {
        StatsService service = new StatsService();
        int expectedDay = 5;
        int actualDay = service.LessthenAvgProfit(arr);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindMonthsMoreThenAverage() {
        StatsService service = new StatsService();
        int expectedDay = 5;
        int actualDay = service.MorethenAvgProfit(arr);
        Assertions.assertEquals(expectedDay, actualDay);
    }
}
