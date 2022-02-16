package com.umurcanemre.playerstat.entity;

import com.umurcanemre.playerstat.enums.StatisticTimeScope;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
@Document
public class PlayerGameAttendanceStatistic implements PlayerStatistic  {
    @Id
    private String id;
    @NonNull
    private String playerId;
    @NonNull
    private StatisticTimeScope timeScope;
    @NonNull
    private String timeScopeId;
    @Builder.Default
    private int attendance = 0;
    
}
