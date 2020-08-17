package com.example.hoteladmin.service.impl;

import com.example.hoteladmin.model.Booking;
import com.example.hoteladmin.repository.BookingRepository;
import com.example.hoteladmin.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking save(Booking type) {
        return bookingRepository.save(type);
    }

    @Override
    public Optional<Booking> findOne(Long id) {
        return bookingRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        bookingRepository.deleteById(id);
    }
}
