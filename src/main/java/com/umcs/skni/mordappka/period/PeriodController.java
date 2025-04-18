package com.umcs.skni.mordappka.period;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/periods")
@Tag(name="Period", description = "Zwaraca konkretne semstry"+
        "np.: zimowy 2022/2023")
@RequiredArgsConstructor
public class PeriodController {

    private final PeriodService periodService;

    @GetMapping("/all")
    @Operation(summary = "All periods", description = "Semestry w sensie historycznym")
    public ResponseEntity<List<Period>> getAllPeriods() {
        List<Period> periods = periodService.getAllPeriods();
        return ResponseEntity.ok(periods);
    }
}
