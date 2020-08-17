package com.example.hoteladmin.service;

import com.example.hoteladmin.model.BookingDetail;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookingDetailService {
    public List<BookingDetail> getAllBookingDetail();

    BookingDetail save(BookingDetail type);

    Optional<BookingDetail> findOne(Long id);

    void delete(Long id);
}
