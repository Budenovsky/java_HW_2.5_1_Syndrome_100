package ru.netology.statistic;

public class StatisticsService {
//    @param
//    @return
    public long findMax(long[] incomes) {
        long curren_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
            return current_max;
    }
}
