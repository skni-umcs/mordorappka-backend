package com.umcs.skni.mordappka.major;

import com.umcs.skni.mordappka.faculty.Faculty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "majors")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Major {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "major_id")
    private Long majorId;

    @Column(nullable = false, length = 255, name = "major_name")
    private String majorName;

    @Column(name = "major_degree")
    private String majorDegree;

    @Column(name = "duration_in_sems")
    private Integer durationInSems;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;

    @Column(nullable = false, name = "active")
    private boolean active;
}

