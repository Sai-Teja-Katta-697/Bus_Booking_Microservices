package com.kst.booking.booking_service.service;

import com.kst.booking.booking_service.dto.BusInfoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BusesService {
List<BusInfoDTO> getBuses();
}
