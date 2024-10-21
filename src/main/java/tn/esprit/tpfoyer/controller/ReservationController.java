package tn.esprit.tpfoyer.controller;

import tn.esprit.tpfoyer.entity.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.service.reservation.IReservationService;

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
}
