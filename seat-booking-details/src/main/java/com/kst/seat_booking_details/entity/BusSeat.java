package com.kst.seat_booking_details.entity;

import jakarta.persistence.*;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bus_seats")
public class BusSeat{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_info_id")
    private int seatInfoId;
    //Can we build fk with different services entity classes
    @Column(name = "bus_id", nullable = false)
    private int busId;

    @Column(name = "normal", nullable = false)
    private int normal;

    @Column(name = "semi_sleeper", nullable = false)
    private int semiSleeper;

    @Column(name = "sleeper", nullable = false)
    private int sleeper;

    @Column(name = "is_available", nullable = false)
    private boolean isAvailable ;
         
}