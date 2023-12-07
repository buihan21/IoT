package com.iot.breathingMeachin.service;

import com.iot.breathingMeachin.dto.BenhNhanDto;

import java.util.List;

public interface IBenhNhanService {
    String addBenhNhan(BenhNhanDto benhNhanDto);
    String deleteBenhNhan(Integer idBenhNhan);

    BenhNhanDto getOneBenhNhan(Integer idBenhNhan);
    List<BenhNhanDto> getAllBenhNhan();
}
