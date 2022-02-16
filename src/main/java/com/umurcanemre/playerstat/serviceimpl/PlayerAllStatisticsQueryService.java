package com.umurcanemre.playerstat.serviceimpl;

import com.umurcanemre.playerstat.entity.PlayerStatistic;
import com.umurcanemre.playerstat.enums.StatisticMetricType;
import com.umurcanemre.playerstat.service.PlayerStatisticsQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PlayerAllStatisticsQueryService {
    private final Map<StatisticMetricType, PlayerStatisticsQueryService<?>> statTypeServices;

    public List<PlayerStatistic> getAll() {
        return statTypeServices.values().stream().map(PlayerStatisticsQueryService::getAll).collect(ArrayList::new, List::addAll, List::addAll);
    }
}
