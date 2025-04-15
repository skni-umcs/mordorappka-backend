package com.umcs.skni.mordappka.major;

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
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long majorId;

    @Column(nullable = false, length = 255)
    private String majorName;

    private String majorDegree;

    private Integer durationInSems;

    @ManyToOne
    private Faculty faculty;

    @Column(nullable = false)
    private boolean active;
}

