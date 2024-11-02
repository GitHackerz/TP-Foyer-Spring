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

}
