package com.umcs.skni.mordappka.room;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    List<Room> getAll(){
        return roomRepository.findAll();
    }

}
