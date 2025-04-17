package com.umcs.skni.mordappka.teacher;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    TeacherDTO toDTO(Teacher teacher);
    Teacher toEntity(TeacherDTO teacherDto);
}
