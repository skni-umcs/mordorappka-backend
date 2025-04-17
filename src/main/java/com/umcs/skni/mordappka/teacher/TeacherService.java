package com.umcs.skni.mordappka.teacher;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;
    public List<TeacherDTO> getAll() {
        return ((List<Teacher>) teacherRepository
                .findAll()).stream()
                .map(teacherMapper::toDTO)
                .collect(Collectors.toList());
    }
}
