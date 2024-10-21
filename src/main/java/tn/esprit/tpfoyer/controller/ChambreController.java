package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.service.chambre.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambre")
public class ChambreController {
    private final IChambreService chambreService;

    @GetMapping
    public List<Chambre> findAll() {
        return chambreService.findAll();
    }

    @GetMapping("{id}")
    public Chambre findById(@PathVariable Long id) {
        return chambreService.findById(id).orElseThrow();
    }

    @PostMapping
    public Chambre create(@RequestBody Chambre chambre) {
        return chambreService.create(chambre);
    }

    @PutMapping
    public Chambre update(@RequestBody Chambre chambre) {
        return chambreService.update(chambre);
    }

    @DeleteMapping
    public void deleteAll() {
        chambreService.deleteAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        chambreService.deleteById(id);
    }
}
