package com.kst.seat_booking_details.controller;

import com.kst.seat_booking_details.commonutils.ApiResponse;
import com.kst.seat_booking_details.commonutils.CommonResponse;
import com.kst.seat_booking_details.dto.BusSeatDTO;
import com.kst.seat_booking_details.service.BusSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bus-seat")
public class BusSeatController {
    @Autowired
    private BusSeatService busSeatService;
    @GetMapping
    public ResponseEntity<ApiResponse<List<BusSeatDTO>>> getBusSeatDetails() {
        List<BusSeatDTO> list = busSeatService.getBusSeatDetails();
        return  ResponseEntity.ok(new CommonResponse().success(list));
    }
}
