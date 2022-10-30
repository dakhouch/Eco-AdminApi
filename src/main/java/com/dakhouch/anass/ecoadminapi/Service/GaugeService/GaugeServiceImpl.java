package com.dakhouch.anass.ecoadminapi.Service.GaugeService;

import com.dakhouch.anass.ecoadminapi.Model.Gauge;
import com.dakhouch.anass.ecoadminapi.Repository.GaugeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GaugeServiceImpl implements GaugeService{
    @Autowired
    GaugeRepo gaugeRepo;
    @Override
    public List<Gauge> getGauges() {
        return gaugeRepo.findAll();
    }

    @Override
    public Gauge getGauge(Long id) {
        return gaugeRepo.findById(id).get();
    }

}
