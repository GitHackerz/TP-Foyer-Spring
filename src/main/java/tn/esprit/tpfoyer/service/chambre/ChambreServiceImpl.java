package tn.esprit.tpfoyer.service.chambre;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.enums.TypeChambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    private ChambreRepository chambreRepository;

    public List<Chambre> findAll() {
        return chambreRepository.findAll();
    }

    public Optional<Chambre> findById(Long id) {
        return chambreRepository.findById(id);
    }

    public Chambre create(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public List<Chambre> createAll(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    public Chambre update(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public void delete(Chambre chambre) {
        chambreRepository.delete(chambre);
    }

    public void deleteById(Long id) {
        chambreRepository.deleteById(id);
    }

    public void deleteAll() {
        chambreRepository.deleteAll();
    }

    public Chambre findByNumeroChambre(Long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    public List<Chambre> findByTypeChambre(TypeChambre typeChambre) {
        return chambreRepository.findByTypeChambre(typeChambre);
    }

    public List<Chambre> findByBlocIdBloc(Long blocId) {
        return chambreRepository.findByBlocIdBloc(blocId);
    }

    public List<Chambre> findByBlocIdBlocAndTypeChambre(Long blocId, TypeChambre typeChambre) {
        return chambreRepository.findByBlocIdBlocAndTypeChambre(blocId, typeChambre);
    }

    public List<Chambre> findByNumeroChambreAndTypeChambre(Long numeroChambre, TypeChambre typeChambre) {
        return chambreRepository.findByNumeroChambreAndTypeChambre(numeroChambre, typeChambre);
    }

    public List<Chambre> findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneUniversitaireAndReservationsEtudiantListNomEtudiantAndNumeroChambre(
            String nomUniversite, LocalDate anneUniversitaire, String nomEtudiant, Long numeroChambre) {
        return chambreRepository.findByBlocFoyerUniversiteNomUniversiteAndReservationsAnneUniversitaireAndReservationsEtudiantListNomEtudiantAndNumeroChambre(
                nomUniversite, anneUniversitaire, nomEtudiant, numeroChambre);
    }

    public long countByTypeChambreAndBlocFoyerNomFoyer(TypeChambre typeChambre, String nomFoyer) {
        return chambreRepository.countByTypeChambreAndBlocFoyerNomFoyer(typeChambre, nomFoyer);
    }


}
