package tn.esprit.tpfoyer.controller;

import tn.esprit.tpfoyer.entity.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.service.reservation.IReservationService;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservation")
public class ReservationController {
    private final IReservationService reservationService;

    @GetMapping
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }

    @GetMapping("{id}")
    public Reservation findById(@PathVariable Long id) {
        return reservationService.findById(id).orElseThrow();
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation) {
        return reservationService.create(reservation);
    }

    @PutMapping
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.update(reservation);
    }

    @DeleteMapping
    public void deleteAll() {
        reservationService.deleteAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        reservationService.deleteById(id);
    }

    @GetMapping("/byValidationStatus")
    public List<Reservation> findByEstValide(@RequestParam Boolean estValide) {
        return reservationService.findByEstValide(estValide);
    }

    @GetMapping("/byEtudiantId")
    public List<Reservation> findByEtudiantListId(@RequestParam Long etudiantId) {
        return reservationService.findByEtudiantListId(etudiantId);
    }

    @GetMapping("/byAnneUniversitaireAndValidationStatus")
    public List<Reservation> findByAnneUniversitaireAndEstValide(
            @RequestParam LocalDate anneUniversitaire,
            @RequestParam Boolean estValide) {
        return reservationService.findByAnneUniversitaireAndEstValide(anneUniversitaire, estValide);
    }

}
