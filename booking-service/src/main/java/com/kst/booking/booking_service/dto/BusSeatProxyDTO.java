package com.kst.booking.booking_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusSeatProxyDTO {
    private int seatInfoId;

    private int busId;

    private int normal;

    private int semiSleeper;

    private int sleeper;

    private boolean isAvailable ;
}
