package com.example.hoteladmin.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity

@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private String password;
    @OneToMany(mappedBy = "user")
    private Collection<Booking> bookings;


}
