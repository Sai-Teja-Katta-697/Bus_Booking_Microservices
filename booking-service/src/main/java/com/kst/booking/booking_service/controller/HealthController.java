package com.kst.booking.booking_service.controller;

import com.kst.booking.booking_service.commonutils.ApiResponse;
import com.kst.booking.booking_service.commonutils.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.kst.booking.booking_service.commonutils.ApiEndPoints.HEALTH_CHECK;

@RestController
@RequestMapping(HEALTH_CHECK)
public class HealthController {
    @GetMapping
    public ResponseEntity<ApiResponse<String>> healthCheck() {
        try {
            return ResponseEntity.status(200)
                    .body(new CommonResponse().success("Booking Service is up and running"));
        } catch (Exception e) {
            return ResponseEntity.status(500)
                    .body(new CommonResponse().failure("Booking Service is Down", e.getMessage()));
        }
    }
}
