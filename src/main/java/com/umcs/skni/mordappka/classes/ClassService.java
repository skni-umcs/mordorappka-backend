package com.umcs.skni.mordappka.classes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClassService {
    private final ClassRepository classRepository;

    List<ClassDTO> getClassesByYearId(Long id){
        List<ClassEntity> classes = classRepository.findByPeriod_PeriodId(id);

        return classes.stream().map(ClassDTO::mapFromEntity).collect(Collectors.toList());
    }
}
