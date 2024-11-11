package tn.esprit.tpfoyer.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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
    @Operation(summary = "Get all Blocs", description = "Get all Blocs from the database")
    public List<Bloc> findAll() {
        return blocService.findAll();
    }

    @GetMapping("{id}")
    @Operation(summary = "Get Bloc by id", description = "Get a Bloc by its id from the database")
    public Bloc findById(@Parameter(description = "ID of the Bloc to be searched") @PathVariable Long id) {
        return blocService.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity not found"));

    }

    @Operation(summary = "Create a new Bloc", description = "Create a new Bloc and save it to the database")
    @PostMapping
    public Bloc create(@RequestBody Bloc bloc) {
        return blocService.create(bloc);
    }

    @Operation(summary = "Update a Bloc", description = "Update an existing Bloc in the database")
    @PutMapping
    public Bloc update(@RequestBody Bloc bloc) {
        return blocService.update(bloc);
    }

    @Operation(summary = "Delete all Blocs", description = "Delete all Blocs from the database")
    @DeleteMapping
    public void deleteAll() {
        blocService.deleteAll();
    }

    @Operation(summary = "Delete a Bloc", description = "Delete a Bloc by its id from the database")
    @DeleteMapping("{id}")
    public void delete(@Parameter(description = "ID of the Bloc to be deleted") @PathVariable Long id) {
        blocService.deleteById(id);
    }

    @Operation(summary = "Search for Blocs", description = "Search for Blocs in the database using different parameters")
    @GetMapping("/byNom")
    public List<Bloc> findByNomBloc(@Parameter(description = "Name of the Bloc to be searched") @RequestParam String nomBloc) {
        return blocService.findByNomBloc(nomBloc);
    }

    @Operation(summary = "Search for Blocs", description = "Search for Blocs in the database using different parameters")
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
    public List<Bloc> findByOrderByNomBlocAsc() {
        return blocService.findByOrderByNomBlocAsc();
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
