package com.umurcanemre.playerstat.serviceimpl;

import com.umurcanemre.playerstat.entity.PlayerScoreStatistic;
import com.umurcanemre.playerstat.enums.StatisticMetricType;
import com.umurcanemre.playerstat.service.PlayerStatisticsQueryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Qualifier("scoreStatisticsQueryService")
public class PlayerScoreStatisticsQueryServiceImpl implements PlayerStatisticsQueryService<PlayerScoreStatistic> {
    private static final StatisticMetricType METRIC_TYPE = StatisticMetricType.SCORE;

    @Override
    public StatisticMetricType getType() {
        return METRIC_TYPE;
    }

    @Override
    public Optional<PlayerScoreStatistic> getById(String id) {
        return Optional.empty();
    }

    @Override
    public List<PlayerScoreStatistic> getAll() {
        return Collections.emptyList();
    }
}
