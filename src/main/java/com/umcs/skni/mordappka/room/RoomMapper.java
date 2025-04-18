package com.umcs.skni.mordappka.room;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoomMapper {
//    @Mapping(source = "", target = "")
    RoomDTO toDTO(Room room);
}
