package tn.esprit.tpfoyer.service.etudiant;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    private EtudiantRepository etudiantRepository;
    
    public Etudiant create(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    public Etudiant update(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
    
    public List<Etudiant> createAll(List<Etudiant> etudiants) {
        return etudiantRepository.saveAll(etudiants);
    }
    
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> findById(Long id) {
        return etudiantRepository.findById(id);
    }
    
    public void delete(Etudiant etudiant) {
        etudiantRepository.delete(etudiant);
    }
    
    public void deleteById(Long id) {
        etudiantRepository.deleteById(id);
    }
    
    public void deleteAll() {
        etudiantRepository.deleteAll();
    }

    
    public List<Etudiant> findByNomEtudiant(String nom) {
        return etudiantRepository.findByNomEtudiant(nom);
    }

    
    public List<Etudiant> findByPrenomEtudiant(String prenom) {
        return etudiantRepository.findByPrenomEtudiant(prenom);
    }

    
    public List<Etudiant> findByNomEtudiantAndPrenomEtudiant(String nom, String prenom) {
        return etudiantRepository.findByNomEtudiantAndPrenomEtudiant(nom, prenom);
    }

    
    public List<Etudiant> findByNomEtudiantOrPrenomEtudiant(String nom, String prenom) {
        return etudiantRepository.findByNomEtudiantOrPrenomEtudiant(nom, prenom);
    }

    
    public List<Etudiant> findByIdEtudiantGreaterThan(Long minId) {
        return etudiantRepository.findByIdEtudiantGreaterThan(minId);
    }

    
    public List<Etudiant> findByIdEtudiantLessThan(Long maxId) {
        return etudiantRepository.findByIdEtudiantLessThan(maxId);
    }

    
    public List<Etudiant> findByDateNaissanceAfter(LocalDate date) {
        return etudiantRepository.findByDateNaissanceAfter(date);
    }

    
    public List<Etudiant> findByEcole(String ecole) {
        return etudiantRepository.findByEcole(ecole);
    }

    
    public List<Etudiant> findByReservationsIdReservation(String reservationId) {
        return etudiantRepository.findByReservationsIdReservation(reservationId);
    }

    
    public List<Etudiant> findByReservationsAnneUniversitaire(LocalDate anneUniversitaire) {
        return etudiantRepository.findByReservationsAnneUniversitaire(anneUniversitaire);
    }

    
    public List<Etudiant> findByEcoleAndDateNaissanceAfter(String ecole, LocalDate date) {
        return etudiantRepository.findByEcoleAndDateNaissanceAfter(ecole, date);
    }

    
    public List<Etudiant> findByReservationsAnneUniversitaireOrderByDateNaissance(LocalDate anneUniversitaire) {
        return etudiantRepository.findByReservationsAnneUniversitaireOrderByDateNaissance(anneUniversitaire);
    }

}
