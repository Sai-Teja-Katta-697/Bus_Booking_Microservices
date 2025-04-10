package com.kst.seat_booking_details.controller;

import com.kst.seat_booking_details.commonutils.ApiResponse;
import com.kst.seat_booking_details.commonutils.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.kst.seat_booking_details.commonutils.ApiEndPoints.HEALTH_CHECK;

@RestController
@RequestMapping(HEALTH_CHECK)
public class HealthController {
    @GetMapping
    public ResponseEntity<ApiResponse<String>> healthCheck() {
        try {
            return ResponseEntity.status(200)
                    .body(new CommonResponse().success("Seat Details Service is up and running"));
        } catch (Exception e) {
            return ResponseEntity.status(500)
                    .body(new CommonResponse().failure("Seat Details  Service is Down", e.getMessage()));
        }
    }
}
