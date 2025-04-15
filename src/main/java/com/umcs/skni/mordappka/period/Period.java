package com.umcs.skni.mordappka.period;

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
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long periodId;

    @Column(nullable = false)
    private boolean winterTerm;

    @Column(nullable = false, length = 9)
    private String academicYear;
}
