package com.dakhouch.anass.ecoadminapi.Service.GaugeService;

import com.dakhouch.anass.ecoadminapi.Model.Gauge;

import java.util.List;

public interface GaugeService {
    List<Gauge> getGauges();
    Gauge getGauge(Long id);
}
