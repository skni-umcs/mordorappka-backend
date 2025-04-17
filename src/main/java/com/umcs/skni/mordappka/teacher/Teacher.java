package com.umcs.skni.mordappka.teacher;

import com.umcs.skni.mordappka.faculty.Faculty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teachers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private Long teacherId;

    @Column(nullable = false, length = 300, name = "teacher_name")
    private String teacherName;

    @Column(nullable = false, length = 100, name = "teacher_degree")
    private String teacherDegree;

    @ManyToOne
    @JoinColumn(nullable = false, name = "faculty_id")
    private Faculty faculty;

    @Column(name = "active")
    private Boolean active;
}

