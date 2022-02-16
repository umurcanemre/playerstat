package com.umurcanemre.playerstat.service;

import com.umurcanemre.playerstat.entity.PlayerStatistic;
import com.umurcanemre.playerstat.enums.StatisticMetricType;

import java.util.List;
import java.util.Optional;

public interface PlayerStatisticsQueryService <T extends PlayerStatistic> {
    StatisticMetricType getType();
    Optional<T> getById(String id);
    List<T> getAll();
}