package com.marvic.pruebarelations.restController.hijo;

import com.marvic.pruebarelations.hijo.model.Hijo;
import com.marvic.pruebarelations.hijo.model.dto.HijoDTO;
import com.marvic.pruebarelations.hijo.model.dto.NewHijoDTO;
import com.marvic.pruebarelations.service.hijo.IHijoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/hijo")
public class HijoRestController {

    private IHijoService hijoService;
    public HijoRestController(IHijoService hijoService) {
        this.hijoService = hijoService;
    }

    @GetMapping
    public ResponseEntity<?> getAllHijos() {
        return  ResponseEntity.ok(hijoService.findAll());
    }

    @PostMapping
    public ResponseEntity<HijoDTO> createHijo(@RequestBody NewHijoDTO hijo) {
        return ResponseEntity.ok( hijoService.create(hijo));
    }
}
