package com.example.hoteladmin.service.impl;

import com.example.hoteladmin.model.BookingDetail;
import com.example.hoteladmin.repository.BookingDetailRepository;
import com.example.hoteladmin.service.BookingDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingDetailServiceImpl implements BookingDetailService {
    @Autowired
    private BookingDetailRepository bookingDetailRepository;

    @Override
    public List<BookingDetail> getAllBookingDetail() {
        return bookingDetailRepository.findAll();
    }

    @Override
    public BookingDetail save(BookingDetail type) {
        return bookingDetailRepository.save(type);
    }

    @Override
    public Optional<BookingDetail> findOne(Long id) {
        return bookingDetailRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        bookingDetailRepository.deleteById(id);

    }


}
