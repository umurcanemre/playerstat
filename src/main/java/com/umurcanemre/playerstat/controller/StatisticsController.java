package com.umurcanemre.playerstat.controller;

import com.umurcanemre.playerstat.entity.PlayerStatistic;
import com.umurcanemre.playerstat.serviceimpl.PlayerAllStatisticsQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("statistics")
@RequiredArgsConstructor
public class StatisticsController {
    private final PlayerAllStatisticsQueryService playerAllStatisticsQueryService;

    @PostMapping
    public void postMethodName() {
        //TODO: process POST request

    }

    @GetMapping
    public List<PlayerStatistic> getAllStats() {
        return playerAllStatisticsQueryService.getAll();

    }

}
