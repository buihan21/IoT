package com.iot.breathingMeachin.controller;

import com.iot.breathingMeachin.dto.BenhNhanDto;
import com.iot.breathingMeachin.service.IBenhNhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/iot")
public class BenhNhanController {
    @Autowired
    private IBenhNhanService benhNhanService;
    @PostMapping("/benhNhan/import")
    public String addBenhNhan(@RequestBody BenhNhanDto benhNhanDto) {
        String mess = benhNhanService.addBenhNhan(benhNhanDto);
        return mess;
    }

    @DeleteMapping("/benhNhan/delete")
    public String deleteBenhNhan(@RequestParam("id") Integer idBenhNhan) {
        String mess = benhNhanService.deleteBenhNhan(idBenhNhan);
        return mess;
    }
}
