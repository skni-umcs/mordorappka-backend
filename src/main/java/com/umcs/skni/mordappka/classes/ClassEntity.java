package com.umcs.skni.mordappka.classes;

import com.umcs.skni.mordappka.period.Period;
import com.umcs.skni.mordappka.room.Room;
import com.umcs.skni.mordappka.subject.Subject;
import com.umcs.skni.mordappka.teacher.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.time.Duration;
import java.time.LocalTime;

@Entity
@Table(name = "class")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;

    private String classType;

    @ManyToOne
    private Subject subject;

    @Column(nullable = false, length = 50)
    private String groupId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Teacher teacher;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    @Column(nullable = false)
    private Duration breakDuration;

    @Column(nullable = false)
    private Integer weekday;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Period period;
}

