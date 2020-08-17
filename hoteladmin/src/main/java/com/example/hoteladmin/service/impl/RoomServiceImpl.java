package com.example.hoteladmin.service.impl;

import com.example.hoteladmin.model.Room;
import com.example.hoteladmin.repository.RoomRepository;
import com.example.hoteladmin.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> getAllRoom() {
        return roomRepository.findAll();
    }

    @Override
    public Room save(Room type) {
        return roomRepository.save(type);
    }

    @Override
    public Optional<Room> findOne(Long id) {
        return roomRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
}
