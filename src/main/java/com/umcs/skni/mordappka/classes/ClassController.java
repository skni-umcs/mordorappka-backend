package com.umcs.skni.mordappka.classes;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/classes")
public class ClassController {

    private final ClassService classService;

    @GetMapping("/year")
    public ResponseEntity<List<ClassDTO>> getClassesByYear(@RequestParam final Long id) {
        return ResponseEntity.ok(classService.getClassesByYearId(id));
    }
}