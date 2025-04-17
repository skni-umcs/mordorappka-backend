package com.umcs.skni.mordappka.period;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/periods")
@RequiredArgsConstructor
public class PeriodController {

    private final PeriodService periodService;

    @GetMapping("/all")
    public ResponseEntity<List<Period>> getAllPeriods() {
        List<Period> periods = periodService.getAllPeriods();
        return ResponseEntity.ok(periods);
    }
}
