package tn.esprit.tpfoyer.controller;


import tn.esprit.tpfoyer.entity.Etudiant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.service.etudiant.IEtudiantService;

import java.time.LocalDate;
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

    @GetMapping("/byNom")
    public List<Etudiant> findByNomEtudiant(@RequestParam String nom) {
        return etudiantService.findByNomEtudiant(nom);
    }

    @GetMapping("/byPrenom")
    public List<Etudiant> findByPrenomEtudiant(@RequestParam String prenom) {
        return etudiantService.findByPrenomEtudiant(prenom);
    }

    @GetMapping("/byNomAndPrenom")
    public List<Etudiant> findByNomEtudiantAndPrenomEtudiant(@RequestParam String nom, @RequestParam String prenom) {
        return etudiantService.findByNomEtudiantAndPrenomEtudiant(nom, prenom);
    }

    @GetMapping("/byNomOrPrenom")
    public List<Etudiant> findByNomEtudiantOrPrenomEtudiant(@RequestParam String nom, @RequestParam String prenom) {
        return etudiantService.findByNomEtudiantOrPrenomEtudiant(nom, prenom);
    }

    @GetMapping("/byMinId")
    public List<Etudiant> findByIdEtudiantGreaterThan(@RequestParam Long minId) {
        return etudiantService.findByIdEtudiantGreaterThan(minId);
    }

    @GetMapping("/byMaxId")
    public List<Etudiant> findByIdEtudiantLessThan(@RequestParam Long maxId) {
        return etudiantService.findByIdEtudiantLessThan(maxId);
    }

    @GetMapping("/byDateAfter")
    public List<Etudiant> findByDateNaissanceAfter(@RequestParam LocalDate date) {
        return etudiantService.findByDateNaissanceAfter(date);
    }

    @GetMapping("/byEcole")
    public List<Etudiant> findByEcole(@RequestParam String ecole) {
        return etudiantService.findByEcole(ecole);
    }

    @GetMapping("/byReservationId")
    public List<Etudiant> findByReservationsIdReservation(@RequestParam String reservationId) {
        return etudiantService.findByReservationsIdReservation(reservationId);
    }

    @GetMapping("/byAnneUniversitaire")
    public List<Etudiant> findByReservationsAnneUniversitaire(@RequestParam LocalDate anneUniversitaire) {
        return etudiantService.findByReservationsAnneUniversitaire(anneUniversitaire);
    }

    @GetMapping("/byEcoleAndDateAfter")
    public List<Etudiant> findByEcoleAndDateNaissanceAfter(@RequestParam String ecole, @RequestParam LocalDate date) {
        return etudiantService.findByEcoleAndDateNaissanceAfter(ecole, date);
    }

    @GetMapping("/byAnneUniversitaireOrderedByDate")
    public List<Etudiant> findByReservationsAnneUniversitaireOrderByDateNaissance(@RequestParam LocalDate anneUniversitaire) {
        return etudiantService.findByReservationsAnneUniversitaireOrderByDateNaissance(anneUniversitaire);
    }

}
