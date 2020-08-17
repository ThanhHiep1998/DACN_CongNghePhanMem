package com.example.hoteladmin.service;

import com.example.hoteladmin.model.Room;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoomService {
    List<Room> getAllRoom();

    Room save(Room type);

    Optional<Room> findOne(Long id);

    void delete(Long id);
}
