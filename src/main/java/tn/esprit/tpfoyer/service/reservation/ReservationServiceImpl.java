package tn.esprit.tpfoyer.service.reservation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    private ReservationRepository reservationRepository;


    public Reservation create(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> createAll(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }

    public Reservation update(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> findById(Long id) {
        return reservationRepository.findById(id);
    }

    public void delete(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

    public void deleteById(Long id) {
        reservationRepository.deleteById(id);
    }

    public void deleteAll() {
        reservationRepository.deleteAll();
    }

    public List<Reservation> findByEstValide(Boolean estValide) {
        return reservationRepository.findByEstValide(estValide);
    }

    public List<Reservation> findByEtudiantListId(Long etudiantId) {
        return reservationRepository.findByEtudiantListId(etudiantId);
    }

    public List<Reservation> findByAnneUniversitaireAndEstValide(LocalDate anneUniversitaire, Boolean estValide) {
        return reservationRepository.findByAnneUniversitaireAndEstValide(anneUniversitaire, estValide);
    }

}
