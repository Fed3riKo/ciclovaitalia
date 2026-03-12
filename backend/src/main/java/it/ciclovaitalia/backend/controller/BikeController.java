package it.ciclovaitalia.backend.controller;
import it.ciclovaitalia.backend.model.BikeRoute;
import it.ciclovaitalia.backend.repository.BikeRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bikeroutes")
public class BikeController {
    private final BikeRouteRepository bikeRouteRepository;

    @Autowired
    public BikeController(BikeRouteRepository bikeRouteRepository){
        this.bikeRouteRepository = bikeRouteRepository;
    }

    @GetMapping
    public List<BikeRoute> getRoutes(){
        return bikeRouteRepository.findAll();
    }

    @PostMapping
    public BikeRoute createRoute(@RequestBody BikeRoute route){
        return bikeRouteRepository.save(route);
    }

}
