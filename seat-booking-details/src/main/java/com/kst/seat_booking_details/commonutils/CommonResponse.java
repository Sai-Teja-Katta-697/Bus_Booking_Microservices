package com.kst.seat_booking_details.commonutils;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class CommonResponse {
    public <T> ApiResponse<T> success(T object) {
        return ApiResponse.<T>builder()
                .status("success")
                .data(object)
                .success(true)
                .message("Operation successful")
                .build();
    }
    public <T> ApiResponse<T> failure(T object, String errorMessage) {
        return ApiResponse.<T>builder()
                .status("failure")
                .data(object)
                .success(false)
                .message(errorMessage)
                .build();
    }
}