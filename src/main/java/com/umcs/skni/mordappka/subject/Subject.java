package com.umcs.skni.mordappka.subject;

import com.umcs.skni.mordappka.period.Period;
import com.umcs.skni.mordappka.termGroup.TermGroup;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subjects")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private Long subjectId;

    @ManyToOne
    @JoinColumn(nullable = false, name = "term_group_id")
    private TermGroup termGroup;

    @Column(nullable = false, length = 400, name = "subject_name")
    private String subjectName;

    @ManyToOne
    @JoinColumn(name = "period_id")
    private Period period;
}
