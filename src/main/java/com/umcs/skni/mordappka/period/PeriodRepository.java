package com.umcs.skni.mordappka.period;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeriodRepository extends JpaRepository<Period, Long> {
    // Możesz dodawać własne metody np.:
//    Period findByPeriodId(Long id);
}
