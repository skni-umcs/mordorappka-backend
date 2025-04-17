package com.umcs.skni.mordappka.termGroup;

import com.umcs.skni.mordappka.major.Major;
import com.umcs.skni.mordappka.period.Period;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "term_groups")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TermGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "term_group_id")
    private Long termGroupId;

    @Column(nullable = false, name = "year")
    private Integer year;

    @ManyToOne
    @JoinColumn(name = "major_id")
    private Major major;

    @ManyToOne
    @JoinColumn(name = "period_id")
    private Period period;
}

