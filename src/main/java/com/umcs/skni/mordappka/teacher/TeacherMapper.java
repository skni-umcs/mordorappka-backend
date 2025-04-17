package com.umcs.skni.mordappka.teacher;

import org.mapstruct.Mapper;

@Mapper
public interface TeacherMapper {
    TeacherDTO toDTO(Teacher teacher);
}
