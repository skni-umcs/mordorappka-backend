package com.umcs.skni.mordappka.classes;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RequiredArgsConstructor
@RestController
@Tag(name = "Class", description = "Zwraca plan zajęc grupując po roku/prowadzącym/sali")
@RequestMapping("/classes")
public class ClassController {

    private final ClassService classService;

    @GetMapping("/year")
    @Operation(summary = "Classes By Year", description = "Zwraca klasy po ID roku")
    public ResponseEntity<List<ClassDTO>> getClassesByYear(@RequestParam final Long id) {
        return ResponseEntity.ok(classService.getClassesByYearId(id));
    }
}