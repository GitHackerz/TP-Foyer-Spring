package tn.esprit.tpfoyer.service.universite;

import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.service.IBaseService;

import java.time.LocalDate;
import java.util.List;

public interface IUniversiteService extends IBaseService<Universite, Long> {
    List<Universite> findDistinctByFoyerBlocsChambresReservationsEtudiantListNomEtudiantContainingAndFoyerBlocsChambresReservationsEtudiantListDateNaissanceBetween(
            String nameSubstring, LocalDate startDate, LocalDate endDate);

}
