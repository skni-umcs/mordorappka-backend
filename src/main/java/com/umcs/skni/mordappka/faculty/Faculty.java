package com.umcs.skni.mordappka.faculty;

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
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facultyId;

    @Column(nullable = false, length = 300)
    private String facultyName;
}
