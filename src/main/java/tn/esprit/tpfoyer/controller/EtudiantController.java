package tn.esprit.tpfoyer.controller;


import tn.esprit.tpfoyer.entity.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.service.etudiant.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("etudiant")
public class EtudiantController {
    private final IEtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

    @GetMapping("{id}")
    public Etudiant findById(@PathVariable Long id) {
        return etudiantService.findById(id).orElseThrow();
    }

    @PostMapping
    public Etudiant create(@RequestBody Etudiant etudiant) {
        return etudiantService.create(etudiant);
    }

    @PutMapping
    public Etudiant update(@RequestBody Etudiant etudiant) {
        return etudiantService.update(etudiant);
    }

    @DeleteMapping
    public void deleteAll() {
        etudiantService.deleteAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        etudiantService.deleteById(id);
    }
}
