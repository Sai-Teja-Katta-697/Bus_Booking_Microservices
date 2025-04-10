package com.kst.booking.booking_service.dto;

import com.kst.booking.booking_service.entity.BusTypes;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusInfoDTO {
    private Integer busId;
    private String startPlaces;
    private String destination;
    private Double fare;
    private Integer busType;
    private String comfort;
    private BusTypes busTypes;
}
