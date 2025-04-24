package com.umcs.skni.mordappka.health;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@RequiredArgsConstructor
@Tag(name="Healthcheck", description = "Test zdrowia")
public class HealthController {
    @GetMapping
    @Operation(summary = "healthcheck", description = "Returns 200 when app is alive")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("Ok");
    }
}
