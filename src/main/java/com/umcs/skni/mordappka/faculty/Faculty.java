package com.umcs.skni.mordappka.faculty;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "faculties")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faculty_id")
    private Long facultyId;

    @Column(nullable = false, length = 300, name = "faculty_name")
    private String facultyName;
}
