package com.marvic.pruebarelations.restController;

import com.marvic.pruebarelations.padre.model.Padre;
import com.marvic.pruebarelations.service.padre.IPadreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/padre")
public class PadreRestController {

    private IPadreService padreService;

    PadreRestController(IPadreService padreService) {
        this.padreService = padreService;
    }

    @GetMapping
    public List<Padre> findAll() {
        return padreService.findAll();
    }

    @PostMapping
    public Padre save(@RequestBody Padre padre) {
        return padreService.create(padre);
    }




}
//Formato en el que viajan los datos

// Request -> RestController -> Service -> Respository  <-