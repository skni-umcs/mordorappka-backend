package com.umcs.skni.mordappka.classes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClassService {
    private final ClassRepository classRepository;
    private final ClassMapper classMapper;
    List<ClassDTO> getClassesByYearId(Long termGroupId){
        List<ClassEntity> classes = classRepository.findByTermGroup_TermGroupId(termGroupId);
        return classes.stream().map(classMapper::toDTO).collect(Collectors.toList());
//        return classes;
    }
}
