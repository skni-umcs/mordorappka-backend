package com.umcs.skni.mordappka.teacher;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
@Tag(name="Teacher", description = "Prowadzący zajęcia/wykłady")
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/all")
    @Operation(summary = "All teachers", description = "Zwraca wszytskich prowadzących")
    public ResponseEntity<List<TeacherDTO>> getAllTeachers() {
        return ResponseEntity.ok(teacherService.getAll());
    }
}
