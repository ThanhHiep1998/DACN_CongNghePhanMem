package com.example.hoteladmin.service;

import com.example.hoteladmin.model.RoomType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RoomTypeService {
    List<RoomType> getAllRoomTypes();

    RoomType save(RoomType type);

    Optional<RoomType> findOne(Long id);

    void delete(Long id);
}
