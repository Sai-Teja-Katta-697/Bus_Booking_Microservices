package com.kst.booking.booking_service.microserviceconfig;

import com.kst.booking.booking_service.commonutils.ApiResponse;
import com.kst.booking.booking_service.dto.BusSeatProxyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "seat-booking-details")
public interface SeatBookingProxy {
    @GetMapping("/seat-booking-details/bus-seat")
    ApiResponse<List<BusSeatProxyDTO>> getBusSeatDetails();
}
