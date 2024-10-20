package tn.esprit.tpfoyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Universite;
import tn.esprit.tpfoyer.service.universite.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("universite")
public class UniversiteController {
    private final IUniversiteService universiteService;

    @GetMapping
    public List<Universite> findAll() {
        return universiteService.findAll();
    }

    @GetMapping("{id}")
    public Universite findById(@PathVariable Long id) {
        return universiteService.findById(id).orElseThrow();
    }

    @PostMapping
    public Universite create(@RequestBody Universite universite) {
        return universiteService.create(universite);
    }

    @PutMapping
    public Universite update(@RequestBody Universite universite) {
        return universiteService.update(universite);
    }

    @DeleteMapping
    public void deleteAll() {
        universiteService.deleteAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        universiteService.deleteById(id);
    }
}
