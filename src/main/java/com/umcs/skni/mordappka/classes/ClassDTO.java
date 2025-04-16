package com.umcs.skni.mordappka.classes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class ClassDTO {
    private Long classId;
    private String classType;
    private String subjectName;
    private String teacherName;
    private String startTime;
    private String endTime;
    private int weekday;
    private String roomName;
    private String periodName;

    public static ClassDTO mapFromEntity(ClassEntity entity){
        return ClassDTO.builder()
                .classId(entity.getClassId())
                .classType(entity.getClassType())
                .subjectName(entity.getSubject().getSubjectName())
                .teacherName(entity.getTeacher().getTeacherName())
                .startTime(entity.getStartTime().toString())
                .endTime(entity.getEndTime().toString())
                .weekday(entity.getWeekday())
                .roomName(entity.getRoom().getRoomAddress())
                .periodName(entity.getPeriod().getAcademicYear())
                .build();
    }
}