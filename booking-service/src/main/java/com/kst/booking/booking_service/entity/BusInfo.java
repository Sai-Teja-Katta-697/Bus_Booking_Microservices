package com.kst.booking.booking_service.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "bus_info")
public class BusInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "busid")
    private Integer busId;
    @Column(name = "startplace")
    private String startPlace;
    @Column(name = "destination")
    private String destination;
    @Column(name = "fare")
    private double fare;
    @Column(name = "bustype")
    private Integer busType;
    @Column(name = "comfort")
    private String comfort;
    @ManyToOne
    @JoinColumn(name = "bustype", referencedColumnName = "id",insertable = false, updatable = false)
    @JsonManagedReference
    private BusTypes busTypes;
}
