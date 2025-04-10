package com.kst.booking.booking_service.service.serviceimpl;

import com.kst.booking.booking_service.dao.BusInfoDAO;
import com.kst.booking.booking_service.dto.BusInfoDTO;
import com.kst.booking.booking_service.service.BusesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class BusServiceImpl implements BusesService {
    private final BusInfoDAO busRepository;

    public BusServiceImpl(BusInfoDAO busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public List<BusInfoDTO> getBuses() {
        List<BusInfoDTO> busInfoDTOList = busRepository.findAll().stream().map(
                 bus -> BusInfoDTO.builder()
                        .busId(bus.getBusId())
                        .startPlaces(bus.getStartPlace())
                        .destination(bus.getDestination())
                        .fare(bus.getFare())
                        .busType(bus.getBusType())
                        .comfort(bus.getComfort())
                        .busTypes(bus.getBusTypes())
                        .build()).collect(Collectors.toList());
        return busInfoDTOList;
    }
}
