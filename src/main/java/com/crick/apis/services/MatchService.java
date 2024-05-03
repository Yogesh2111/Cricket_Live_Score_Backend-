package com.crick.apis.services;

import com.crick.apis.entites.Match;

import java.util.List;
import java.util.Map;


public interface MatchService
{
    // to get all matches
    List<Match> getAllMatches();

    // to get all Live Matches
    List<Match> getLiveMatches();

    //get cwc 2023 point table

    List<List<String>> getPointTable();

}
