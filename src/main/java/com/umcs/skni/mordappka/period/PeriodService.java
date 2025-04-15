package com.umcs.skni.mordappka.period;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeriodService {

    private final PeriodRepository periodRepository;

    public List<Period> getAllPeriods() {
        return periodRepository.findAll();
    }
}
