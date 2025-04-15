package com.umcs.skni.mordappka.teacher;

import com.umcs.skni.mordappka.faculty.Faculty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;

    @Column(nullable = false, length = 300)
    private String teacherName;

    @Column(nullable = false, length = 100)
    private String teacherDegree;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Faculty faculty;

    private Boolean active;
}

