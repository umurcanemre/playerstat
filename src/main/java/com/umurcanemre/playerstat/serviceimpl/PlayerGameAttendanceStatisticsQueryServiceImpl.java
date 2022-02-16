package com.umurcanemre.playerstat.serviceimpl;

import com.umurcanemre.playerstat.entity.PlayerGameAttendanceStatistic;
import com.umurcanemre.playerstat.enums.StatisticMetricType;
import com.umurcanemre.playerstat.service.PlayerStatisticsQueryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Qualifier("attendanceStatisticsQueryService")
public class PlayerGameAttendanceStatisticsQueryServiceImpl implements PlayerStatisticsQueryService<PlayerGameAttendanceStatistic> {
    private static final StatisticMetricType METRIC_TYPE = StatisticMetricType.ATTENDANCE;

    @Override
    public StatisticMetricType getType() {
        return METRIC_TYPE;
    }

    @Override
    public Optional<PlayerGameAttendanceStatistic> getById(String id) {
        return Optional.empty();
    }

    @Override
    public List<PlayerGameAttendanceStatistic> getAll() {

        return Collections.emptyList();
    }
}
