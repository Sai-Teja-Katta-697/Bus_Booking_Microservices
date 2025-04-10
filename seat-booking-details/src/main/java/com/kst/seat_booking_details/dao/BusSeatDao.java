package com.kst.seat_booking_details.dao;

import com.kst.seat_booking_details.entity.BusSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusSeatDao extends JpaRepository<BusSeat, Integer> {
}
