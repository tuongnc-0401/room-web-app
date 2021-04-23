package com.tuong.roomwebapp.service;

import com.tuong.roomwebapp.data.RoomRepository;
import com.tuong.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public  List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
