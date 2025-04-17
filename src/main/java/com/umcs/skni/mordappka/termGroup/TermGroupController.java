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
    @GetMapping("/all")
    @Operation(summary = "All TermGroups", description = "zwraca wszystkie obecne kierunki")
    public ResponseEntity<List<TermGroupDTO>> findAll() {
        return ResponseEntity.ok(termGroupService.findAll());
    }
}
