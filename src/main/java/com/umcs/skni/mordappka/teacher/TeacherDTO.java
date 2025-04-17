package com.umcs.skni.mordappka.teacher;

public record TeacherDTO(
        Long teacherId
        , String teacherName
        , String teacherDegree
        , String facultyName
) {
}
