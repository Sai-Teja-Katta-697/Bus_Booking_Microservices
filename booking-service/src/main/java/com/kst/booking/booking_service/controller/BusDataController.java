package com.kst.booking.booking_service.controller;

import com.kst.booking.booking_service.commonutils.ApiResponse;
import com.kst.booking.booking_service.commonutils.CommonResponse;
import com.kst.booking.booking_service.dto.BusInfoDTO;
import com.kst.booking.booking_service.dto.BusSeatProxyDTO;
import com.kst.booking.booking_service.microserviceconfig.SeatBookingProxy;
import com.kst.booking.booking_service.service.BusesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.kst.booking.booking_service.commonutils.ApiEndPoints.BUSES;

@RestController
@RequestMapping(BUSES)
public class BusDataController {

    private final BusesService busesService;
    private final SeatBookingProxy seatBookingProxy;
    public BusDataController(BusesService busesService, SeatBookingProxy seatBookingProxy) {
        this.busesService = busesService;
        this.seatBookingProxy = seatBookingProxy;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<BusInfoDTO>>> getBusData() {
      List<BusInfoDTO> list= busesService.getBuses();
        return ResponseEntity.status(200)
                .body(new CommonResponse().success(list));
    }
    @GetMapping("/proxy")
    public ResponseEntity<ApiResponse<List<BusSeatProxyDTO>>> getBusDataProxy() {
        return ResponseEntity.ok().body(seatBookingProxy.getBusSeatDetails());
    }

}