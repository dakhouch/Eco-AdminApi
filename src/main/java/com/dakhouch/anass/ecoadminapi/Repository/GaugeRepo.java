package com.dakhouch.anass.ecoadminapi.Repository;

import com.dakhouch.anass.ecoadminapi.Model.Gauge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GaugeRepo extends JpaRepository<Gauge,Long> {
}
