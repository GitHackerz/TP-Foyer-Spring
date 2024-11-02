package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    List<Reservation> findByEstValide(Boolean estValide);
    List<Reservation> findByEtudiantListId(Long etudiantId);
    List<Reservation> findByAnneUniversitaireAndEstValide(LocalDate anneUniversitaire, Boolean estValide);

}
