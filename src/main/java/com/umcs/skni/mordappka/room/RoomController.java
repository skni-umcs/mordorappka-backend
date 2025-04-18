package com.umcs.skni.mordappka.room;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@RequiredArgsConstructor
@Tag(name="Room", description = "Grupa endpointów obsługująca sale")
public class RoomController {

    private final RoomService roomService;

    @GetMapping("/all")
    @Operation(summary = "All rooms", description = "Zwraca wszystkie sale na uczelni")
    public ResponseEntity<List<RoomDTO>> getAllRooms() {
        return ResponseEntity.ok(roomService.getAll());
    }
}
