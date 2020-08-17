package com.example.hoteladmin.service.impl;

import com.example.hoteladmin.model.RoomType;
import com.example.hoteladmin.repository.RoomTypeRepository;
import com.example.hoteladmin.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomTypeServiceImpl implements RoomTypeService {
    @Autowired
    private RoomTypeRepository roomTypeRepository;

    @Override
    public RoomType save(RoomType type) {
        return roomTypeRepository.save(type);
    }

    @Override
    public List<RoomType> getAllRoomTypes() {
        return roomTypeRepository.findAll();
    }

    @Override
    public Optional<RoomType> findOne(Long id) {
        return roomTypeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        roomTypeRepository.deleteById(id);
    }


}
