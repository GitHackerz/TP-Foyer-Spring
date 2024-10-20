package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
