package com.umcs.skni.mordappka.termGroup;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/termgroup")
@RequiredArgsConstructor
public class TermGroupController {
    private final TermGroupService termGroupService;
    @GetMapping("/all")
    public ResponseEntity<List<TermGroupDTO>> findAll() {
        return ResponseEntity.ok(termGroupService.findAll());
    }
}
