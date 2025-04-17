package com.umcs.skni.mordappka.classes;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClassMapper {
    ClassDTO toDTO(ClassEntity classEntity);
    ClassEntity toEntity(ClassDTO classDTO);
}
