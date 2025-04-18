package com.umcs.skni.mordappka.room;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;
    private final RoomMapper roomMapper;
    List<RoomDTO> getAll(){
        return (List<RoomDTO>) roomRepository.findAll().stream().map(roomMapper::toDTO).toList();
    }

}
