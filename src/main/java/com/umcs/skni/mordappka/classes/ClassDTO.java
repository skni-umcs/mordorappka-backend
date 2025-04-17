package com.umcs.skni.mordappka.classes;

public record ClassDTO(
        Long classId,
        String classType,
        String subjectName,
        String teacherName,
        String startTime,
        String endTime,
        int weekday,
        String roomName,
        String periodName
){}