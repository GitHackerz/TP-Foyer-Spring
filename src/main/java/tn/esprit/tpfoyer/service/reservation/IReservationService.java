package tn.esprit.tpfoyer.service.reservation;

import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.service.IBaseService;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService extends IBaseService<Reservation, Long> {
    List<Reservation> findByEstValide(Boolean estValide);

    List<Reservation> findByEtudiantListId(Long etudiantId);

    List<Reservation> findByAnneUniversitaireAndEstValide(LocalDate anneUniversitaire, Boolean estValide);

}

