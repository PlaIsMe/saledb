package com.lbp.repository;

import java.util.List;
import java.util.Map;

public interface StatsRepository {
    List<Object []> countProductsByCate();
    List<Object[]> statsRevenue(Map<String, String> params);
}
