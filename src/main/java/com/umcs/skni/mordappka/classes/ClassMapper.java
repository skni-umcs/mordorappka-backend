package com.umcs.skni.mordappka.classes;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClassMapper {
    @Mapping(source = "teacher.teacherName", target = "teacherName")
    @Mapping(source = "subject.subjectName", target = "subjectName")
    @Mapping(source = "room.roomNumber", target = "roomNumber")
    @Mapping(source = "room.roomId", target = "roomId")
    @Mapping(source = "teacher.teacherId", target = "teacherId")
    @Mapping(source = "groupId", target = "group")
    ClassDTO toDTO(ClassEntity classEntity);
}
