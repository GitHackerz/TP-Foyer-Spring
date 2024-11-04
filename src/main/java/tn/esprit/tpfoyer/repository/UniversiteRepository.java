package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Universite;

import java.time.LocalDate;
import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
    List<Universite> findDistinctByFoyerBlocsChambresReservationsEtudiantListNomEtudiantContainingAndFoyerBlocsChambresReservationsEtudiantListDateNaissanceBetween(
            String nameSubstring, LocalDate startDate, LocalDate endDate);


}
