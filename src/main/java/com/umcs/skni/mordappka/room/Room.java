package com.umcs.skni.mordappka.room;

import com.umcs.skni.mordappka.faculty.Faculty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rooms")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @Column(nullable = false, length = 10, name = "room_number")
    private String roomNumber;

    @ManyToOne
    @JoinColumn(nullable = false, name = "faculty_id")
    private Faculty faculty;

    @Column(name = "room_address")
    private String roomAddress;

    @Column(name = "room_capacity")
    private Integer roomCapacity;
}