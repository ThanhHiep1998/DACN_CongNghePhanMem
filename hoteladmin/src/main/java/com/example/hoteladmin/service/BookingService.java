package com.example.hoteladmin.service;

import com.example.hoteladmin.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookingService {
    List<Booking> getAllBooking();

    Booking save(Booking type);

    Optional<Booking> findOne(Long id);

    void delete(Long id);

}
