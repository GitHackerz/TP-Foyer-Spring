package tn.esprit.tpfoyer.service.universite;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    private UniversiteRepository universiteRepository;


    public List<Universite> findAll() {
        return universiteRepository.findAll();
    }

    public Optional<Universite> findById(Long id) {
        return universiteRepository.findById(id);
    }

    public Universite create(Universite universite) {
        return universiteRepository.save(universite);
    }
    
    public List<Universite> createAll(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    public Universite update(Universite universite) {
        return universiteRepository.save(universite);
    }

    public void delete(Universite universite) {
        universiteRepository.delete(universite);
    }

    public void deleteById(Long id) {
        universiteRepository.deleteById(id);
    }

    public void deleteAll() {
        universiteRepository.deleteAll();
    }

    public List<Universite> findDistinctByFoyerBlocsChambresReservationsEtudiantListNomEtudiantContainingAndFoyerBlocsChambresReservationsEtudiantListDateNaissanceBetween(
            String nameSubstring, LocalDate startDate, LocalDate endDate) {
        return universiteRepository.findDistinctByFoyerBlocsChambresReservationsEtudiantListNomEtudiantContainingAndFoyerBlocsChambresReservationsEtudiantListDateNaissanceBetween(nameSubstring, startDate, endDate);
    }

}

