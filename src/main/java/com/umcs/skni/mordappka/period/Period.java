package com.umcs.skni.mordappka.period;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "periods")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "period_id")
    private Long periodId;

    @Column(nullable = false, name = "winter_term")
    private boolean winterTerm;

    @Column(nullable = false, length = 9, name = "academic_year")
    private String academicYear;
}
