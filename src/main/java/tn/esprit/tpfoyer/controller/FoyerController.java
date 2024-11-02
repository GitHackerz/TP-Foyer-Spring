package tn.esprit.tpfoyer.controller;

import tn.esprit.tpfoyer.entity.Foyer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.service.foyer.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("foyer")
public class FoyerController {
    private final IFoyerService foyerService;

    @GetMapping
    public List<Foyer> findAll() {
        return foyerService.findAll();
    }

    @GetMapping("{id}")
    public Foyer findById(@PathVariable Long id) {
        return foyerService.findById(id).orElseThrow();
    }

    @PostMapping
    public Foyer create(@RequestBody Foyer foyer) {
        return foyerService.create(foyer);
    }

    @PutMapping
    public Foyer update(@RequestBody Foyer foyer) {
        return foyerService.update(foyer);
    }

    @DeleteMapping
    public void deleteAll() {
        foyerService.deleteAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        foyerService.deleteById(id);
    }

    @GetMapping("/byBlocId")
    public List<Foyer> findByBlocsId(@RequestParam Long blocId) {
        return foyerService.findByBlocsId(blocId);
    }

    @GetMapping("/byIdAndBlocId")
    public Foyer findByIdFoyerAndBlocsIdBloc(@RequestParam Long idFoyer, @RequestParam Long blocId) {
        return foyerService.findByIdFoyerAndBlocsIdBloc(idFoyer, blocId);
    }

    @GetMapping("/byBlocCapacite")
    public List<Foyer> findByBlocsCapaciteBloc(@RequestParam Long capaciteBloc) {
        return foyerService.findByBlocsCapaciteBloc(capaciteBloc);
    }

    @GetMapping("/byBlocIdAndUniversiteId")
    public Foyer findByBlocsIdBlocAndUniversiteIdUniversite(@RequestParam Long blocId, @RequestParam Long universiteId) {
        return foyerService.findByBlocsIdBlocAndUniversiteIdUniversite(blocId, universiteId);
    }
}
