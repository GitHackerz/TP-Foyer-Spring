package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.enums.TypeChambre;

import java.time.LocalDate;
import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    Chambre findByNumeroChambre(Long numeroChambre);

    List<Chambre> findByTypeChambre(TypeChambre typeChambre);

    List<Chambre> findByBlocIdBloc(Long blocId);

    List<Chambre> findByBlocIdBlocAndTypeChambre(Long blocId, TypeChambre typeChambre);

    List<Chambre> findByNumeroChambreAndTypeChambre(Long numeroChambre, TypeChambre typeChambre);

    List<Chambre> findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneUniversitaireAndReservationsEtudiantListNomEtudiantAndNumeroChambre(
            String nomUniversite, LocalDate anneUniversitaire, String nomEtudiant, Long numeroChambre);

    long countByTypeChambreAndBlocFoyerNomFoyer(TypeChambre typeChambre, String nomFoyer);

}
