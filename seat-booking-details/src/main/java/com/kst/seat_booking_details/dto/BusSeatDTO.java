package com.kst.seat_booking_details.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusSeatDTO {
    private int seatInfoId;

    private int busId;

    private int normal;

    private int semiSleeper;

    private int sleeper;

    private boolean isAvailable ;
}
