package tn.esprit.tpfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.service.bloc.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("bloc")
public class BlocController {
    private final IBlocService blocService;

    @GetMapping
    public List<Bloc> findAll() {
        return blocService.findAll();
    }

    @GetMapping("{id}")
    public Bloc findById(@PathVariable Long id) {
        return blocService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity not found"));

    }

    @PostMapping
    public Bloc create(@RequestBody Bloc bloc) {
        return blocService.create(bloc);
    }

    @PutMapping
    public Bloc update(@RequestBody Bloc bloc) {
        return blocService.update(bloc);
    }

    @DeleteMapping
    public void deleteAll() {
        blocService.deleteAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        blocService.deleteById(id);
    }

    @GetMapping("/byNom")
    public List<Bloc> findByNomBloc(@RequestParam String nomBloc) {
        return blocService.findByNomBloc(nomBloc);
    }

    @GetMapping("/byCapacite")
    public List<Bloc> findByCapaciteBloc(@RequestParam Long capaciteBloc) {
        return blocService.findByCapaciteBloc(capaciteBloc);
    }

    @GetMapping("/byNomAndCapacite")
    public List<Bloc> findByNomBlocAndCapaciteBloc(@RequestParam String nomBloc, @RequestParam Long capaciteBloc) {
        return blocService.findByNomBlocAndCapaciteBloc(nomBloc, capaciteBloc);
    }

    @GetMapping("/byNomIgnoreCase")
    public List<Bloc> findByNomBlocIgnoreCase(@RequestParam String nomBloc) {
        return blocService.findByNomBlocIgnoreCase(nomBloc);
    }

    @GetMapping("/byCapaciteGreaterThan")
    public List<Bloc> findByCapaciteBlocGreaterThan(@RequestParam Long minCap) {
        return blocService.findByCapaciteBlocGreaterThan(minCap);
    }

    @GetMapping("/byNomContains")
    public List<Bloc> findByNomBlocContains(@RequestParam String nom) {
        return blocService.findByNomBlocContains(nom);
    }

    @GetMapping("/orderedByNom")
    public List<Bloc> findByOrderByNomBlocAsc(String nom) {
        return blocService.findByOrderByNomBlocAsc(nom);
    }

    @GetMapping("/byNomOrCapacite")
    public List<Bloc> findByNomBlocOrCapaciteBloc(@RequestParam String nom, @RequestParam Long capacite) {
        return blocService.findByNomBlocOrCapaciteBloc(nom, capacite);
    }

    @GetMapping("/byFoyerId")
    public List<Bloc> findByFoyerIdFoyer(@RequestParam Long idFoyer) {
        return blocService.findByFoyerIdFoyer(idFoyer);
    }

    @GetMapping("/byUniversiteId")
    public List<Bloc> findByFoyerUniversiteIdUniversite(@RequestParam Long universiteId) {
        return blocService.findByFoyerUniversiteIdUniversite(universiteId);
    }


}
