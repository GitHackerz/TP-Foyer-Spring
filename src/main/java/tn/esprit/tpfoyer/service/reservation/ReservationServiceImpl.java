package tn.esprit.tpfoyer.service.reservation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Reservation;
import tn.esprit.tpfoyer.Repositories.ReservationRepository;
import tn.esprit.tpfoyer.service.IBaseService;

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
}
