package tn.esprit.tpfoyer.service.chambre;

import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.enums.TypeChambre;
import tn.esprit.tpfoyer.service.IBaseService;

import java.time.LocalDate;
import java.util.List;

public interface IChambreService extends IBaseService<Chambre, Long> {
    Chambre findByNumeroChambre(Long numeroChambre);

    List<Chambre> findByTypeChambre(TypeChambre typeChambre);

    List<Chambre> findByBlocIdBloc(Long blocId);

    List<Chambre> findByBlocIdBlocAndTypeChambre(Long blocId, TypeChambre typeChambre);

    List<Chambre> findByNumeroChambreAndTypeChambre(Long numeroChambre, TypeChambre typeChambre);

    List<Chambre> findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneUniversitaireAndReservationsEtudiantListNomEtudiantAndNumeroChambre(
            String nomUniversite, LocalDate anneUniversitaire, String nomEtudiant, Long numeroChambre);

    long countByTypeChambreAndBlocFoyerNomFoyer(TypeChambre typeChambre, String nomFoyer);

}
