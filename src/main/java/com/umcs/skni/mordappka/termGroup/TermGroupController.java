package com.umcs.skni.mordappka.termGroup;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/termgroups")
@Tag(name="TermGroups", description = "Konkretne roczniki np.:\"Inf st.2 sem zimiowy 23/24\"")
@RequiredArgsConstructor
public class TermGroupController {
    private final TermGroupService termGroupService;

    @GetMapping("/active")
    @Operation(summary = "Active TermGroups", description = "zwraca wszystkie aktywne kierunki np.: inf2 lato 2024/2025")
    public ResponseEntity<List<TermGroupDTO>> findActive() {
        return ResponseEntity.ok(termGroupService.findActive());
    }
    @GetMapping("/all")
    @Operation(summary = "Active TermGroups", description = "zwraca wszystkie (w tym historyczne) kierunki np.: inf2 lato 2021/2022")
    public ResponseEntity<List<TermGroupDTO>> findAll() {
        return ResponseEntity.ok(termGroupService.findAll());
    }
}
