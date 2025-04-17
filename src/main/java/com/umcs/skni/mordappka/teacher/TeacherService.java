package com.umcs.skni.mordappka.teacher;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;
    public List<Teacher> getAll() {
        return (List<Teacher>) teacherRepository.findAll();
    }
}
