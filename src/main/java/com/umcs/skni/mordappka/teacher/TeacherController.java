package com.umcs.skni.mordappka.teacher;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/all")
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        // TODO mozna dodać DTO, ale będzie identyczne jak entity
        return ResponseEntity.ok(teacherService.getAll());
    }
}
