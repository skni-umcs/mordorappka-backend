package com.umcs.skni.mordappka.room;

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
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column(nullable = false, length = 10)
    private String roomNumber;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Faculty faculty;

    private String roomAddress;

    private Integer roomCapacity;
}