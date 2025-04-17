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
@Table(name = "classes")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ClassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long classId;

    @Column(name = "class_type")
    private String classType;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(nullable = false, length = 50, name = "group_id")
    private String groupId;

    @ManyToOne
    @JoinColumn(nullable = false, name = "teacher_id")
    private Teacher teacher;

    @Column(nullable = false, name = "start_time")
    private LocalTime startTime;

    @Column(nullable = false, name = "end_time")
    private LocalTime endTime;

    @Column(nullable = false, name = "break_duration")
    private Duration breakDuration;

    @Column(nullable = false, name = "weekday")
    private Integer weekday;

    @Column(nullable = false, name = "every_two_weeks")
    private boolean everyTwoWeeks;

    @ManyToOne
    @JoinColumn(nullable = false, name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(nullable = false, name = "period_id")
    private Period period;


}

