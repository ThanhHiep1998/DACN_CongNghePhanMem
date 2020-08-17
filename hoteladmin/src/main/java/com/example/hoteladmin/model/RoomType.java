package com.example.hoteladmin.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;


@Entity

@Data
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "roomType")
    private Collection<Room> rooms;
}
