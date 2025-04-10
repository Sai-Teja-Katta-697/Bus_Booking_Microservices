package com.kst.booking.booking_service.dao;

import com.kst.booking.booking_service.entity.BusInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BusInfoDAO extends JpaRepository<BusInfo, Integer> {

}
