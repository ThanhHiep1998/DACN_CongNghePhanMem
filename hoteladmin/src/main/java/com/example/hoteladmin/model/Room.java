package com.example.hoteladmin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity

@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String price;
    private String bed;
    private String size;
    @ManyToOne
    @JoinColumn(name = "roomType_id")
    private RoomType roomType;
    @OneToMany(mappedBy = "booking")
    private Collection<BookingDetail> bookingDetails;


}
