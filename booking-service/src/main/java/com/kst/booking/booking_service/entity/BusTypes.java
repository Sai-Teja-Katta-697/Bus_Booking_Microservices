package com.kst.booking.booking_service.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "bustypes")
public class BusTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "categeory")
    private String categeory;
    @Column(name = "servicetype")
    private String serviceType;
    @OneToMany(mappedBy = "busType")
    @JsonBackReference
    private List<BusInfo> busInfo;
}
