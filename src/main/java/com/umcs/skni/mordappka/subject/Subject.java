package com.umcs.skni.mordappka.subject;

import com.umcs.skni.mordappka.period.Period;
import com.umcs.skni.mordappka.termGroup.TermGroup;
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
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private TermGroup termGroup;

    @Column(nullable = false, length = 400)
    private String subjectName;

    @ManyToOne
    private Period period;
}
