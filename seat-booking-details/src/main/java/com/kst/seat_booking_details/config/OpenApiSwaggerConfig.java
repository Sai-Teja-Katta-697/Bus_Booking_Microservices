package com.kst.seat_booking_details.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Seat Booking Details API",
                version = "1.0",
                description = "API documentation for Seat Booking Details service"
        ))
@Configuration
public class OpenApiSwaggerConfig {
}

