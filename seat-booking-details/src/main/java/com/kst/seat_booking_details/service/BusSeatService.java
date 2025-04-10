package com.kst.seat_booking_details.service;

import com.kst.seat_booking_details.dao.BusSeatDao;
import com.kst.seat_booking_details.dto.BusSeatDTO;
import com.kst.seat_booking_details.entity.BusSeat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusSeatService {
    @Autowired
    private BusSeatDao busSeatDao;

    public List<BusSeatDTO> getBusSeatDetails() {
        List<BusSeat> busSeatDTOList = busSeatDao.findAll();
        return busSeatDTOList.stream().map(busSeat -> BusSeatDTO.builder()
                .seatInfoId(busSeat.getSeatInfoId())
                .busId(busSeat.getBusId())
                .normal(busSeat.getNormal())
                .semiSleeper(busSeat.getSemiSleeper())
                .sleeper(busSeat.getSleeper())
                .isAvailable(busSeat.isAvailable())
                .build()).collect(Collectors.toList());
    }
}
