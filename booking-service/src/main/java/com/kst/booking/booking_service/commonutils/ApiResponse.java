package com.kst.booking.booking_service.commonutils;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {
    private String status;
    private boolean success;
    private Object data;
    private String message;
}
