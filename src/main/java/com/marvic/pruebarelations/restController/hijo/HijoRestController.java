package com.marvic.pruebarelations.restController.hijo;

import com.marvic.pruebarelations.hijo.model.Hijo;
import com.marvic.pruebarelations.hijo.model.dto.NewHijoDTO;
import com.marvic.pruebarelations.service.hijo.IHijoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/hijo")
public class HijoRestController {

    private IHijoService hijoService;
    public HijoRestController(IHijoService hijoService) {
        this.hijoService = hijoService;
    }

    @GetMapping
    public List<Hijo> getAllHijos() {
        return hijoService.findAll();
    }

    @PostMapping
    public Hijo createHijo(@RequestBody NewHijoDTO hijo) {
        return hijoService.create(new Hijo(hijo));
    }
}
