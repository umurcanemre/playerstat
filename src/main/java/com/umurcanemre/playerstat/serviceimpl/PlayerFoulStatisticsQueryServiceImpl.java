package com.umurcanemre.playerstat.serviceimpl;

import com.umurcanemre.playerstat.entity.PlayerFoulStatistic;
import com.umurcanemre.playerstat.enums.StatisticMetricType;
import com.umurcanemre.playerstat.service.PlayerStatisticsQueryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Qualifier("foulStatisticsQueryService")
public class PlayerFoulStatisticsQueryServiceImpl implements PlayerStatisticsQueryService<PlayerFoulStatistic> {
    private static final StatisticMetricType METRIC_TYPE = StatisticMetricType.FOUL;
    @Override
    public StatisticMetricType getType() {
        return METRIC_TYPE;
    }

    @Override
    public Optional<PlayerFoulStatistic> getById(String id) {
        return Optional.empty();
    }

    @Override
    public List<PlayerFoulStatistic> getAll() {
        return Collections.emptyList();
    }
}
