package com.umcs.skni.mordappka.termGroup;

import com.umcs.skni.mordappka.major.Major;
import com.umcs.skni.mordappka.period.Period;
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
public class TermGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long termGroupId;

    @Column(nullable = false)
    private Integer year;

    @ManyToOne
    private Major major;

    @ManyToOne
    private Period period;
}

