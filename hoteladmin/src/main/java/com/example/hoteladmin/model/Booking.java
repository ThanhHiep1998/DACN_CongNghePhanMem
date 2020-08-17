package com.example.hoteladmin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String total_price;
    @OneToMany(mappedBy = "booking")
    private Collection<BookingDetail> bookingDetails;

}
