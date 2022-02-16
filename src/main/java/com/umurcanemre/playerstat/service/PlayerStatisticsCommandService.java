package com.umurcanemre.playerstat.service;

import com.umurcanemre.playerstat.command.AccruableGameMetric;

public interface PlayerStatisticsCommandService {
    <T extends AccruableGameMetric> void accumulateToStatistics(T metric);
}
