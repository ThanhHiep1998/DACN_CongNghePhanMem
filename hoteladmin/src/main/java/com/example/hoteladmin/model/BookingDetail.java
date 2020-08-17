package com.example.hoteladmin.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BookingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "rooms_id")
    private Room room;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    private String price;
    private String quantity;


}
