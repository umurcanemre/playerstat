package com.umurcanemre.playerstat.entity;

import java.math.BigDecimal;

import com.mongodb.lang.NonNull;
import com.umurcanemre.playerstat.enums.StatisticTimeScope;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document
public class PlayerScoreStatistic implements PlayerStatistic  {
    @Id
    private String id;
    @NonNull
    private String playerId;
    @NonNull
    private StatisticTimeScope timeScope;
    @NonNull
    private String timeScopeId;
    @Builder.Default
    private BigDecimal score = BigDecimal.ZERO;
}
