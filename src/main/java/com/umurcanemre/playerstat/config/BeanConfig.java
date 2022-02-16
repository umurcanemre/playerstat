package com.umurcanemre.playerstat.config;

import com.umurcanemre.playerstat.enums.StatisticMetricType;
import com.umurcanemre.playerstat.service.PlayerStatisticsQueryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class BeanConfig {

    @Bean
    public Map<StatisticMetricType, PlayerStatisticsQueryService<?>> statTypeQueryServices(
            @Qualifier("foulStatisticsQueryService") PlayerStatisticsQueryService<?> foulQueryService,
            @Qualifier("attendanceStatisticsQueryService") PlayerStatisticsQueryService<?> attendanceQueryService,
            @Qualifier("scoreStatisticsQueryService") PlayerStatisticsQueryService<?> scoreQueryService) {
        return Stream.of(foulQueryService, attendanceQueryService, scoreQueryService).collect(Collectors.toMap(PlayerStatisticsQueryService::getType, Function.identity()));
    }
}
